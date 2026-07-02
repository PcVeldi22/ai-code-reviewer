package com.pcveldi.codereview.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "code_reviews")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CodeReviewResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String originalCode;

    @Column(nullable = false)
    private String language;

    @Column(columnDefinition = "TEXT")
    private String reviewSummary;

    @ElementCollection
    @CollectionTable(name = "review_issues")
    private List<String> issues;

    @ElementCollection
    @CollectionTable(name = "review_suggestions")
    private List<String> suggestions;

    private Integer securityScore;
    private Integer qualityScore;
    private Integer maintainabilityScore;
    private Integer overallScore;

    @Enumerated(EnumType.STRING)
    private ReviewStatus status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public enum ReviewStatus {
        PENDING, IN_PROGRESS, COMPLETED, FAILED
    }
}
