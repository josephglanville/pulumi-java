// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.FrameworkTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
 * 
 */
public final class FrameworkControlControlScopePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrameworkControlControlScopePropertiesArgs Empty = new FrameworkControlControlScopePropertiesArgs();

    /**
     * The ID of the only AWS resource that you want your control scope to contain.
     * 
     */
    @InputImport(name="complianceResourceIds")
      private final @Nullable Output<List<String>> complianceResourceIds;

    public Output<List<String>> getComplianceResourceIds() {
        return this.complianceResourceIds == null ? Output.empty() : this.complianceResourceIds;
    }

    /**
     * Describes whether the control scope includes one or more types of resources, such as `EFS` or `RDS`.
     * 
     */
    @InputImport(name="complianceResourceTypes")
      private final @Nullable Output<List<String>> complianceResourceTypes;

    public Output<List<String>> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? Output.empty() : this.complianceResourceTypes;
    }

    /**
     * Describes whether the control scope includes resources with one or more tags. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<FrameworkTagArgs>> tags;

    public Output<List<FrameworkTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FrameworkControlControlScopePropertiesArgs(
        @Nullable Output<List<String>> complianceResourceIds,
        @Nullable Output<List<String>> complianceResourceTypes,
        @Nullable Output<List<FrameworkTagArgs>> tags) {
        this.complianceResourceIds = complianceResourceIds;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tags = tags;
    }

    private FrameworkControlControlScopePropertiesArgs() {
        this.complianceResourceIds = Output.empty();
        this.complianceResourceTypes = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlControlScopePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> complianceResourceIds;
        private @Nullable Output<List<String>> complianceResourceTypes;
        private @Nullable Output<List<FrameworkTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlControlScopePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceIds = defaults.complianceResourceIds;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tags = defaults.tags;
        }

        public Builder complianceResourceIds(@Nullable Output<List<String>> complianceResourceIds) {
            this.complianceResourceIds = complianceResourceIds;
            return this;
        }

        public Builder complianceResourceIds(@Nullable List<String> complianceResourceIds) {
            this.complianceResourceIds = Output.ofNullable(complianceResourceIds);
            return this;
        }

        public Builder complianceResourceTypes(@Nullable Output<List<String>> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        public Builder complianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = Output.ofNullable(complianceResourceTypes);
            return this;
        }

        public Builder tags(@Nullable Output<List<FrameworkTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FrameworkTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public FrameworkControlControlScopePropertiesArgs build() {
            return new FrameworkControlControlScopePropertiesArgs(complianceResourceIds, complianceResourceTypes, tags);
        }
    }
}
