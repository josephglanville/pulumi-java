// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Aggregated statistics about an issue model.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse Empty = new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse();

    /**
     * Number of conversations the issue model has analyzed at this point in time.
     * 
     */
    @Import(name="analyzedConversationsCount", required=true)
      private final String analyzedConversationsCount;

    public String getAnalyzedConversationsCount() {
        return this.analyzedConversationsCount;
    }

    /**
     * Statistics on each issue. Key is the issue's resource name.
     * 
     */
    @Import(name="issueStats", required=true)
      private final Map<String,String> issueStats;

    public Map<String,String> getIssueStats() {
        return this.issueStats;
    }

    /**
     * Number of analyzed conversations for which no issue was applicable at this point in time.
     * 
     */
    @Import(name="unclassifiedConversationsCount", required=true)
      private final String unclassifiedConversationsCount;

    public String getUnclassifiedConversationsCount() {
        return this.unclassifiedConversationsCount;
    }

    public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(
        String analyzedConversationsCount,
        Map<String,String> issueStats,
        String unclassifiedConversationsCount) {
        this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount, "expected parameter 'analyzedConversationsCount' to be non-null");
        this.issueStats = Objects.requireNonNull(issueStats, "expected parameter 'issueStats' to be non-null");
        this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount, "expected parameter 'unclassifiedConversationsCount' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse() {
        this.analyzedConversationsCount = null;
        this.issueStats = Map.of();
        this.unclassifiedConversationsCount = null;
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

        public Builder analyzedConversationsCount(String analyzedConversationsCount) {
            this.analyzedConversationsCount = Objects.requireNonNull(analyzedConversationsCount);
            return this;
        }
        public Builder issueStats(Map<String,String> issueStats) {
            this.issueStats = Objects.requireNonNull(issueStats);
            return this;
        }
        public Builder unclassifiedConversationsCount(String unclassifiedConversationsCount) {
            this.unclassifiedConversationsCount = Objects.requireNonNull(unclassifiedConversationsCount);
            return this;
        }        public GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse(analyzedConversationsCount, issueStats, unclassifiedConversationsCount);
        }
    }
}
