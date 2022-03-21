// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents Activity timeline item.
 * 
 */
public final class ActivityTimelineItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActivityTimelineItemResponse Empty = new ActivityTimelineItemResponse();

    /**
     * The grouping bucket end time.
     * 
     */
    @Import(name="bucketEndTimeUTC", required=true)
      private final String bucketEndTimeUTC;

    public String getBucketEndTimeUTC() {
        return this.bucketEndTimeUTC;
    }

    /**
     * The grouping bucket start time.
     * 
     */
    @Import(name="bucketStartTimeUTC", required=true)
      private final String bucketStartTimeUTC;

    public String getBucketStartTimeUTC() {
        return this.bucketStartTimeUTC;
    }

    /**
     * The activity timeline content.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    /**
     * The time of the first activity in the grouping bucket.
     * 
     */
    @Import(name="firstActivityTimeUTC", required=true)
      private final String firstActivityTimeUTC;

    public String getFirstActivityTimeUTC() {
        return this.firstActivityTimeUTC;
    }

    /**
     * The entity query kind
     * Expected value is 'Activity'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The time of the last activity in the grouping bucket.
     * 
     */
    @Import(name="lastActivityTimeUTC", required=true)
      private final String lastActivityTimeUTC;

    public String getLastActivityTimeUTC() {
        return this.lastActivityTimeUTC;
    }

    /**
     * The activity query id.
     * 
     */
    @Import(name="queryId", required=true)
      private final String queryId;

    public String getQueryId() {
        return this.queryId;
    }

    /**
     * The activity timeline title.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String getTitle() {
        return this.title;
    }

    public ActivityTimelineItemResponse(
        String bucketEndTimeUTC,
        String bucketStartTimeUTC,
        String content,
        String firstActivityTimeUTC,
        String kind,
        String lastActivityTimeUTC,
        String queryId,
        String title) {
        this.bucketEndTimeUTC = Objects.requireNonNull(bucketEndTimeUTC, "expected parameter 'bucketEndTimeUTC' to be non-null");
        this.bucketStartTimeUTC = Objects.requireNonNull(bucketStartTimeUTC, "expected parameter 'bucketStartTimeUTC' to be non-null");
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.firstActivityTimeUTC = Objects.requireNonNull(firstActivityTimeUTC, "expected parameter 'firstActivityTimeUTC' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lastActivityTimeUTC = Objects.requireNonNull(lastActivityTimeUTC, "expected parameter 'lastActivityTimeUTC' to be non-null");
        this.queryId = Objects.requireNonNull(queryId, "expected parameter 'queryId' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private ActivityTimelineItemResponse() {
        this.bucketEndTimeUTC = null;
        this.bucketStartTimeUTC = null;
        this.content = null;
        this.firstActivityTimeUTC = null;
        this.kind = null;
        this.lastActivityTimeUTC = null;
        this.queryId = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityTimelineItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketEndTimeUTC;
        private String bucketStartTimeUTC;
        private String content;
        private String firstActivityTimeUTC;
        private String kind;
        private String lastActivityTimeUTC;
        private String queryId;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityTimelineItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketEndTimeUTC = defaults.bucketEndTimeUTC;
    	      this.bucketStartTimeUTC = defaults.bucketStartTimeUTC;
    	      this.content = defaults.content;
    	      this.firstActivityTimeUTC = defaults.firstActivityTimeUTC;
    	      this.kind = defaults.kind;
    	      this.lastActivityTimeUTC = defaults.lastActivityTimeUTC;
    	      this.queryId = defaults.queryId;
    	      this.title = defaults.title;
        }

        public Builder bucketEndTimeUTC(String bucketEndTimeUTC) {
            this.bucketEndTimeUTC = Objects.requireNonNull(bucketEndTimeUTC);
            return this;
        }
        public Builder bucketStartTimeUTC(String bucketStartTimeUTC) {
            this.bucketStartTimeUTC = Objects.requireNonNull(bucketStartTimeUTC);
            return this;
        }
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder firstActivityTimeUTC(String firstActivityTimeUTC) {
            this.firstActivityTimeUTC = Objects.requireNonNull(firstActivityTimeUTC);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastActivityTimeUTC(String lastActivityTimeUTC) {
            this.lastActivityTimeUTC = Objects.requireNonNull(lastActivityTimeUTC);
            return this;
        }
        public Builder queryId(String queryId) {
            this.queryId = Objects.requireNonNull(queryId);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ActivityTimelineItemResponse build() {
            return new ActivityTimelineItemResponse(bucketEndTimeUTC, bucketStartTimeUTC, content, firstActivityTimeUTC, kind, lastActivityTimeUTC, queryId, title);
        }
    }
}
