// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFeedArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFeedArgs Empty = new GetFeedArgs();

    @Import(name="feedId", required=true)
      private final String feedId;

    public String getFeedId() {
        return this.feedId;
    }

    @Import(name="v1Id", required=true)
      private final String v1Id;

    public String getV1Id() {
        return this.v1Id;
    }

    @Import(name="v1Id1", required=true)
      private final String v1Id1;

    public String getV1Id1() {
        return this.v1Id1;
    }

    public GetFeedArgs(
        String feedId,
        String v1Id,
        String v1Id1) {
        this.feedId = Objects.requireNonNull(feedId, "expected parameter 'feedId' to be non-null");
        this.v1Id = Objects.requireNonNull(v1Id, "expected parameter 'v1Id' to be non-null");
        this.v1Id1 = Objects.requireNonNull(v1Id1, "expected parameter 'v1Id1' to be non-null");
    }

    private GetFeedArgs() {
        this.feedId = null;
        this.v1Id = null;
        this.v1Id1 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String feedId;
        private String v1Id;
        private String v1Id1;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.feedId = defaults.feedId;
    	      this.v1Id = defaults.v1Id;
    	      this.v1Id1 = defaults.v1Id1;
        }

        public Builder feedId(String feedId) {
            this.feedId = Objects.requireNonNull(feedId);
            return this;
        }
        public Builder v1Id(String v1Id) {
            this.v1Id = Objects.requireNonNull(v1Id);
            return this;
        }
        public Builder v1Id1(String v1Id1) {
            this.v1Id1 = Objects.requireNonNull(v1Id1);
            return this;
        }        public GetFeedArgs build() {
            return new GetFeedArgs(feedId, v1Id, v1Id1);
        }
    }
}
