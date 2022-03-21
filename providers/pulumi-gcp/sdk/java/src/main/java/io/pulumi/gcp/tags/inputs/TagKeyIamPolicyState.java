// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyIamPolicyState Empty = new TagKeyIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData == null ? Output.empty() : this.policyData;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagKey")
      private final @Nullable Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey == null ? Output.empty() : this.tagKey;
    }

    public TagKeyIamPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> tagKey) {
        this.etag = etag;
        this.policyData = policyData;
        this.tagKey = tagKey;
    }

    private TagKeyIamPolicyState() {
        this.etag = Output.empty();
        this.policyData = Output.empty();
        this.tagKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> tagKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.tagKey = defaults.tagKey;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Output.ofNullable(policyData);
            return this;
        }
        public Builder tagKey(@Nullable Output<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = Output.ofNullable(tagKey);
            return this;
        }        public TagKeyIamPolicyState build() {
            return new TagKeyIamPolicyState(etag, policyData, tagKey);
        }
    }
}
