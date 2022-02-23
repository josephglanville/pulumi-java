// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterGetArgs Empty = new CxPageFormParameterGetArgs();

    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The entity type of the parameter.
     * Format: projects/-/locations/-/agents/-/entityTypes/<System Entity Type ID> for system entity types (for example, projects/-/locations/-/agents/-/entityTypes/sys.date), or projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/entityTypes/<Entity Type ID> for developer entity types.
     * 
     */
    @InputImport(name="entityType")
      private final @Nullable Input<String> entityType;

    public Input<String> getEntityType() {
        return this.entityType == null ? Input.empty() : this.entityType;
    }

    /**
     * Defines fill behavior for the parameter.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fillBehavior")
      private final @Nullable Input<CxPageFormParameterFillBehaviorGetArgs> fillBehavior;

    public Input<CxPageFormParameterFillBehaviorGetArgs> getFillBehavior() {
        return this.fillBehavior == null ? Input.empty() : this.fillBehavior;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @InputImport(name="isList")
      private final @Nullable Input<Boolean> isList;

    public Input<Boolean> getIsList() {
        return this.isList == null ? Input.empty() : this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log.
     * If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @InputImport(name="redact")
      private final @Nullable Input<Boolean> redact;

    public Input<Boolean> getRedact() {
        return this.redact == null ? Input.empty() : this.redact;
    }

    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them.
     * Required parameters must be filled before form filling concludes.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Input<Boolean> required;

    public Input<Boolean> getRequired() {
        return this.required == null ? Input.empty() : this.required;
    }

    public CxPageFormParameterGetArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> entityType,
        @Nullable Input<CxPageFormParameterFillBehaviorGetArgs> fillBehavior,
        @Nullable Input<Boolean> isList,
        @Nullable Input<Boolean> redact,
        @Nullable Input<Boolean> required) {
        this.displayName = displayName;
        this.entityType = entityType;
        this.fillBehavior = fillBehavior;
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    private CxPageFormParameterGetArgs() {
        this.displayName = Input.empty();
        this.entityType = Input.empty();
        this.fillBehavior = Input.empty();
        this.isList = Input.empty();
        this.redact = Input.empty();
        this.required = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> entityType;
        private @Nullable Input<CxPageFormParameterFillBehaviorGetArgs> fillBehavior;
        private @Nullable Input<Boolean> isList;
        private @Nullable Input<Boolean> redact;
        private @Nullable Input<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEntityType(@Nullable Input<String> entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityType(@Nullable String entityType) {
            this.entityType = Input.ofNullable(entityType);
            return this;
        }

        public Builder setFillBehavior(@Nullable Input<CxPageFormParameterFillBehaviorGetArgs> fillBehavior) {
            this.fillBehavior = fillBehavior;
            return this;
        }

        public Builder setFillBehavior(@Nullable CxPageFormParameterFillBehaviorGetArgs fillBehavior) {
            this.fillBehavior = Input.ofNullable(fillBehavior);
            return this;
        }

        public Builder setIsList(@Nullable Input<Boolean> isList) {
            this.isList = isList;
            return this;
        }

        public Builder setIsList(@Nullable Boolean isList) {
            this.isList = Input.ofNullable(isList);
            return this;
        }

        public Builder setRedact(@Nullable Input<Boolean> redact) {
            this.redact = redact;
            return this;
        }

        public Builder setRedact(@Nullable Boolean redact) {
            this.redact = Input.ofNullable(redact);
            return this;
        }

        public Builder setRequired(@Nullable Input<Boolean> required) {
            this.required = required;
            return this;
        }

        public Builder setRequired(@Nullable Boolean required) {
            this.required = Input.ofNullable(required);
            return this;
        }
        public CxPageFormParameterGetArgs build() {
            return new CxPageFormParameterGetArgs(displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}
