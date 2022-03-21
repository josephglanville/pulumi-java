// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.managedservices.inputs.PlanArgs;
import io.pulumi.azurenative.managedservices.inputs.RegistrationDefinitionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistrationDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationDefinitionArgs Empty = new RegistrationDefinitionArgs();

    /**
     * Plan details for the managed services.
     * 
     */
    @Import(name="plan")
      private final @Nullable Output<PlanArgs> plan;

    public Output<PlanArgs> getPlan() {
        return this.plan == null ? Output.empty() : this.plan;
    }

    /**
     * Properties of a registration definition.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<RegistrationDefinitionPropertiesArgs> properties;

    public Output<RegistrationDefinitionPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Guid of the registration definition.
     * 
     */
    @Import(name="registrationDefinitionId")
      private final @Nullable Output<String> registrationDefinitionId;

    public Output<String> getRegistrationDefinitionId() {
        return this.registrationDefinitionId == null ? Output.empty() : this.registrationDefinitionId;
    }

    /**
     * Scope of the resource.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public RegistrationDefinitionArgs(
        @Nullable Output<PlanArgs> plan,
        @Nullable Output<RegistrationDefinitionPropertiesArgs> properties,
        @Nullable Output<String> registrationDefinitionId,
        Output<String> scope) {
        this.plan = plan;
        this.properties = properties;
        this.registrationDefinitionId = registrationDefinitionId;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RegistrationDefinitionArgs() {
        this.plan = Output.empty();
        this.properties = Output.empty();
        this.registrationDefinitionId = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PlanArgs> plan;
        private @Nullable Output<RegistrationDefinitionPropertiesArgs> properties;
        private @Nullable Output<String> registrationDefinitionId;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.registrationDefinitionId = defaults.registrationDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder plan(@Nullable Output<PlanArgs> plan) {
            this.plan = plan;
            return this;
        }
        public Builder plan(@Nullable PlanArgs plan) {
            this.plan = Output.ofNullable(plan);
            return this;
        }
        public Builder properties(@Nullable Output<RegistrationDefinitionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable RegistrationDefinitionPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder registrationDefinitionId(@Nullable Output<String> registrationDefinitionId) {
            this.registrationDefinitionId = registrationDefinitionId;
            return this;
        }
        public Builder registrationDefinitionId(@Nullable String registrationDefinitionId) {
            this.registrationDefinitionId = Output.ofNullable(registrationDefinitionId);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public RegistrationDefinitionArgs build() {
            return new RegistrationDefinitionArgs(plan, properties, registrationDefinitionId, scope);
        }
    }
}
