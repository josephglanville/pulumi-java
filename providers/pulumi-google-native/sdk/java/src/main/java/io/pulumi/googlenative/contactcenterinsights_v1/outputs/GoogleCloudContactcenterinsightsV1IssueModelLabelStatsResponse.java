// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse {
    private final String analyzedConversationsCount;
    private final Map<String,String> issueStats;
    private final String unclassifiedConversationsCount;

    @OutputCustomType.Constructor({"analyzedConversationsCount","issueStats","unclassifiedConversationsCount"})
    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(
        String analyzedConversationsCount,
        Map<String,String> issueStats,
        String unclassifiedConversationsCount) {
        this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount);
        this.issueStats = Objects.requireNonNull(issueStats);
        this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount);
    }

    public String getAnalyzedConversationsCount() {
        return this.analyzedConversationsCount;
    }
    public Map<String,String> getIssueStats() {
        return this.issueStats;
    }
    public String getUnclassifiedConversationsCount() {
        return this.unclassifiedConversationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analyzedConversationsCount;
        private Map<String,String> issueStats;
        private String unclassifiedConversationsCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyzedConversationsCount = defaults.analyzedConversationsCount;
    	      this.issueStats = defaults.issueStats;
    	      this.unclassifiedConversationsCount = defaults.unclassifiedConversationsCount;
        }

        public Builder setAnalyzedConversationsCount(String analyzedConversationsCount) {
            this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount);
            return this;
        }

        public Builder setIssueStats(Map<String,String> issueStats) {
            this.issueStats = Objects.requireNonNull(issueStats);
            return this;
        }

        public Builder setUnclassifiedConversationsCount(String unclassifiedConversationsCount) {
            this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(analyzedConversationsCount, issueStats, unclassifiedConversationsCount);
        }
    }
}