// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * User set display name of the inspect template.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The core content of the template.
     * Structure is documented below.
     * 
     */
    @InputImport(name="inspectConfig")
      private final @Nullable Input<PreventionInspectTemplateInspectConfigArgs> inspectConfig;

    public Input<PreventionInspectTemplateInspectConfigArgs> getInspectConfig() {
        return this.inspectConfig == null ? Input.empty() : this.inspectConfig;
    }

    /**
     * The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    public PreventionInspectTemplateArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<PreventionInspectTemplateInspectConfigArgs> inspectConfig,
        Input<String> parent) {
        this.description = description;
        this.displayName = displayName;
        this.inspectConfig = inspectConfig;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private PreventionInspectTemplateArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.inspectConfig = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<PreventionInspectTemplateInspectConfigArgs> inspectConfig;
        private Input<String> parent;

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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setInspectConfig(@Nullable Input<PreventionInspectTemplateInspectConfigArgs> inspectConfig) {
            this.inspectConfig = inspectConfig;
            return this;
        }

        public Builder setInspectConfig(@Nullable PreventionInspectTemplateInspectConfigArgs inspectConfig) {
            this.inspectConfig = Input.ofNullable(inspectConfig);
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }
        public PreventionInspectTemplateArgs build() {
            return new PreventionInspectTemplateArgs(description, displayName, inspectConfig, parent);
        }
    }
}
