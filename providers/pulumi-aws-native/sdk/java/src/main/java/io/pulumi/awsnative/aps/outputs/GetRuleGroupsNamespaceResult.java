// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps.outputs;

import io.pulumi.awsnative.aps.outputs.RuleGroupsNamespaceTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRuleGroupsNamespaceResult {
    /**
     * The RuleGroupsNamespace ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * The RuleGroupsNamespace data.
     * 
     */
    private final @Nullable String data;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<RuleGroupsNamespaceTag> tags;
    /**
     * Required to identify a specific APS Workspace associated with this RuleGroupsNamespace.
     * 
     */
    private final @Nullable String workspace;

    @CustomType.Constructor
    private GetRuleGroupsNamespaceResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("tags") @Nullable List<RuleGroupsNamespaceTag> tags,
        @CustomType.Parameter("workspace") @Nullable String workspace) {
        this.arn = arn;
        this.data = data;
        this.tags = tags;
        this.workspace = workspace;
    }

    /**
     * The RuleGroupsNamespace ARN.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The RuleGroupsNamespace data.
     * 
    */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<RuleGroupsNamespaceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Required to identify a specific APS Workspace associated with this RuleGroupsNamespace.
     * 
    */
    public Optional<String> getWorkspace() {
        return Optional.ofNullable(this.workspace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleGroupsNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String data;
        private @Nullable List<RuleGroupsNamespaceTag> tags;
        private @Nullable String workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleGroupsNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.data = defaults.data;
    	      this.tags = defaults.tags;
    	      this.workspace = defaults.workspace;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder tags(@Nullable List<RuleGroupsNamespaceTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(RuleGroupsNamespaceTag... tags) {
            return tags(List.of(tags));
        }
        public Builder workspace(@Nullable String workspace) {
            this.workspace = workspace;
            return this;
        }        public GetRuleGroupsNamespaceResult build() {
            return new GetRuleGroupsNamespaceResult(arn, data, tags, workspace);
        }
    }
}
