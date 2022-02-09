// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.managedservices.inputs.PlanArgs;
import io.pulumi.azurenative.managedservices.inputs.RegistrationDefinitionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistrationDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationDefinitionArgs Empty = new RegistrationDefinitionArgs();

    @InputImport(name="plan")
    private final @Nullable Input<PlanArgs> plan;

    public Input<PlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="properties")
    private final @Nullable Input<RegistrationDefinitionPropertiesArgs> properties;

    public Input<RegistrationDefinitionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="registrationDefinitionId")
    private final @Nullable Input<String> registrationDefinitionId;

    public Input<String> getRegistrationDefinitionId() {
        return this.registrationDefinitionId == null ? Input.empty() : this.registrationDefinitionId;
    }

    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public RegistrationDefinitionArgs(
        @Nullable Input<PlanArgs> plan,
        @Nullable Input<RegistrationDefinitionPropertiesArgs> properties,
        @Nullable Input<String> registrationDefinitionId,
        Input<String> scope) {
        this.plan = plan;
        this.properties = properties;
        this.registrationDefinitionId = registrationDefinitionId;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RegistrationDefinitionArgs() {
        this.plan = Input.empty();
        this.properties = Input.empty();
        this.registrationDefinitionId = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PlanArgs> plan;
        private @Nullable Input<RegistrationDefinitionPropertiesArgs> properties;
        private @Nullable Input<String> registrationDefinitionId;
        private Input<String> scope;

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

        public Builder setPlan(@Nullable Input<PlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable PlanArgs plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setProperties(@Nullable Input<RegistrationDefinitionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable RegistrationDefinitionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setRegistrationDefinitionId(@Nullable Input<String> registrationDefinitionId) {
            this.registrationDefinitionId = registrationDefinitionId;
            return this;
        }

        public Builder setRegistrationDefinitionId(@Nullable String registrationDefinitionId) {
            this.registrationDefinitionId = Input.ofNullable(registrationDefinitionId);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public RegistrationDefinitionArgs build() {
            return new RegistrationDefinitionArgs(plan, properties, registrationDefinitionId, scope);
        }
    }
}
