// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateArgs Empty = new PreventionInspectTemplateArgs();

    /**
     * A description of the inspect template.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * User set display name of the inspect template.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The core content of the template.
     * Structure is documented below.
     * 
     */
    @Import(name="inspectConfig")
      private final @Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig;

    public Output<PreventionInspectTemplateInspectConfigArgs> getInspectConfig() {
        return this.inspectConfig == null ? Codegen.empty() : this.inspectConfig;
    }

    /**
     * The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    public PreventionInspectTemplateArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig,
        Output<String> parent) {
        this.description = description;
        this.displayName = displayName;
        this.inspectConfig = inspectConfig;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private PreventionInspectTemplateArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.inspectConfig = Codegen.empty();
        this.parent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig;
        private Output<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder inspectConfig(@Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig) {
            this.inspectConfig = inspectConfig;
            return this;
        }
        public Builder inspectConfig(@Nullable PreventionInspectTemplateInspectConfigArgs inspectConfig) {
            this.inspectConfig = Codegen.ofNullable(inspectConfig);
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }        public PreventionInspectTemplateArgs build() {
            return new PreventionInspectTemplateArgs(description, displayName, inspectConfig, parent);
        }
    }
}
