// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a form parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FormParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormParameterArgs Empty = new GoogleCloudDialogflowCxV3beta1FormParameterArgs();

    /**
     * The default value of an optional parameter. If the parameter is required, the default value will be ignored.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<Object> defaultValue;

    public Output<Object> getDefaultValue() {
        return this.defaultValue == null ? Codegen.empty() : this.defaultValue;
    }

    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    @Import(name="entityType", required=true)
      private final Output<String> entityType;

    public Output<String> getEntityType() {
        return this.entityType;
    }

    /**
     * Defines fill behavior for the parameter.
     * 
     */
    @Import(name="fillBehavior", required=true)
      private final Output<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior;

    public Output<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> getFillBehavior() {
        return this.fillBehavior;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @Import(name="isList")
      private final @Nullable Output<Boolean> isList;

    public Output<Boolean> getIsList() {
        return this.isList == null ? Codegen.empty() : this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @Import(name="redact")
      private final @Nullable Output<Boolean> redact;

    public Output<Boolean> getRedact() {
        return this.redact == null ? Codegen.empty() : this.redact;
    }

    /**
     * Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
     * 
     */
    @Import(name="required")
      private final @Nullable Output<Boolean> required;

    public Output<Boolean> getRequired() {
        return this.required == null ? Codegen.empty() : this.required;
    }

    public GoogleCloudDialogflowCxV3beta1FormParameterArgs(
        @Nullable Output<Object> defaultValue,
        Output<String> displayName,
        Output<String> entityType,
        Output<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior,
        @Nullable Output<Boolean> isList,
        @Nullable Output<Boolean> redact,
        @Nullable Output<Boolean> required) {
        this.defaultValue = defaultValue;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.fillBehavior = Objects.requireNonNull(fillBehavior, "expected parameter 'fillBehavior' to be non-null");
        this.isList = isList;
        this.redact = redact;
        this.required = required;
    }

    private GoogleCloudDialogflowCxV3beta1FormParameterArgs() {
        this.defaultValue = Codegen.empty();
        this.displayName = Codegen.empty();
        this.entityType = Codegen.empty();
        this.fillBehavior = Codegen.empty();
        this.isList = Codegen.empty();
        this.redact = Codegen.empty();
        this.required = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> defaultValue;
        private Output<String> displayName;
        private Output<String> entityType;
        private Output<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior;
        private @Nullable Output<Boolean> isList;
        private @Nullable Output<Boolean> redact;
        private @Nullable Output<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.fillBehavior = defaults.fillBehavior;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
    	      this.required = defaults.required;
        }

        public Builder defaultValue(@Nullable Output<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Codegen.ofNullable(defaultValue);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder entityType(Output<String> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Output.of(Objects.requireNonNull(entityType));
            return this;
        }
        public Builder fillBehavior(Output<GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs> fillBehavior) {
            this.fillBehavior = Objects.requireNonNull(fillBehavior);
            return this;
        }
        public Builder fillBehavior(GoogleCloudDialogflowCxV3beta1FormParameterFillBehaviorArgs fillBehavior) {
            this.fillBehavior = Output.of(Objects.requireNonNull(fillBehavior));
            return this;
        }
        public Builder isList(@Nullable Output<Boolean> isList) {
            this.isList = isList;
            return this;
        }
        public Builder isList(@Nullable Boolean isList) {
            this.isList = Codegen.ofNullable(isList);
            return this;
        }
        public Builder redact(@Nullable Output<Boolean> redact) {
            this.redact = redact;
            return this;
        }
        public Builder redact(@Nullable Boolean redact) {
            this.redact = Codegen.ofNullable(redact);
            return this;
        }
        public Builder required(@Nullable Output<Boolean> required) {
            this.required = required;
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = Codegen.ofNullable(required);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1FormParameterArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FormParameterArgs(defaultValue, displayName, entityType, fillBehavior, isList, redact, required);
        }
    }
}
