// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterArgs Empty = new CxPageFormParameterArgs();

    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/<System Entity Type ID> for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/entityTypes/<Entity Type ID> for developer entity types.
     * 
     */
    @InputImport(name="entityType")
      private final @Nullable Output<String> entityType;

    public Output<String> getEntityType() {
        return this.entityType == null ? Output.empty() : this.entityType;
    }

    /**
     * Defines fill behavior for the parameter.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fillBehavior")
      private final @Nullable Output<CxPageFormParameterFillBehaviorArgs> fillBehavior;

    public Output<CxPageFormParameterFillBehaviorArgs> getFillBehavior() {
        return this.fillBehavior == null ? Output.empty() : this.fillBehavior;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @InputImport(name="isList")
      private final @Nullable Output<Boolean> isList;

    public Output<Boolean> getIsList() {
        return this.isList == null ? Output.empty() : this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log.
     * If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @InputImport(name="redact")
      private final @Nullable Output<Boolean> redact;

    public Output<Boolean> getRedact() {
        return this.redact == null ? Output.empty() : this.redact;
    }

    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them.
     * Required parameters must be filled before form filling concludes.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Output<Boolean> required;

    public Output<Boolean> getRequired() {
        return this.required == null ? Output.empty() : this.required;
    }

    public CxPageFormParameterArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> entityType,
        @Nullable Output<CxPageFormParameterFillBehaviorArgs> fillBehavior,
        @Nullable Output<Boolean> isList,
        @Nullable Output<Boolean> redact,
        @Nullable Output<Boolean> required) {
        this.displayName = displayName;
        this.entityType = entityType;
        this.fillBehavior = fillBehavior;
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    private CxPageFormParameterArgs() {
        this.displayName = Output.empty();
        this.entityType = Output.empty();
        this.fillBehavior = Output.empty();
        this.isList = Output.empty();
        this.redact = Output.empty();
        this.required = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> entityType;
        private @Nullable Output<CxPageFormParameterFillBehaviorArgs> fillBehavior;
        private @Nullable Output<Boolean> isList;
        private @Nullable Output<Boolean> redact;
        private @Nullable Output<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder entityType(@Nullable Output<String> entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder entityType(@Nullable String entityType) {
            this.entityType = Output.ofNullable(entityType);
            return this;
        }

        public Builder fillBehavior(@Nullable Output<CxPageFormParameterFillBehaviorArgs> fillBehavior) {
            this.fillBehavior = fillBehavior;
            return this;
        }

        public Builder fillBehavior(@Nullable CxPageFormParameterFillBehaviorArgs fillBehavior) {
            this.fillBehavior = Output.ofNullable(fillBehavior);
            return this;
        }

        public Builder isList(@Nullable Output<Boolean> isList) {
            this.isList = isList;
            return this;
        }

        public Builder isList(@Nullable Boolean isList) {
            this.isList = Output.ofNullable(isList);
            return this;
        }

        public Builder redact(@Nullable Output<Boolean> redact) {
            this.redact = redact;
            return this;
        }

        public Builder redact(@Nullable Boolean redact) {
            this.redact = Output.ofNullable(redact);
            return this;
        }

        public Builder required(@Nullable Output<Boolean> required) {
            this.required = required;
            return this;
        }

        public Builder required(@Nullable Boolean required) {
            this.required = Output.ofNullable(required);
            return this;
        }
        public CxPageFormParameterArgs build() {
            return new CxPageFormParameterArgs(displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}
