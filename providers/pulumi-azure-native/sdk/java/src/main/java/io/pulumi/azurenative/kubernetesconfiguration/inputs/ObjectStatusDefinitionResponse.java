// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.HelmReleasePropertiesDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ObjectReferenceDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ObjectStatusConditionDefinitionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectStatusDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectStatusDefinitionResponse Empty = new ObjectStatusDefinitionResponse();

    @InputImport(name="appliedBy")
    private final @Nullable ObjectReferenceDefinitionResponse appliedBy;

    public Optional<ObjectReferenceDefinitionResponse> getAppliedBy() {
        return this.appliedBy == null ? Optional.empty() : Optional.ofNullable(this.appliedBy);
    }

    @InputImport(name="complianceState")
    private final @Nullable String complianceState;

    public Optional<String> getComplianceState() {
        return this.complianceState == null ? Optional.empty() : Optional.ofNullable(this.complianceState);
    }

    @InputImport(name="helmReleaseProperties")
    private final @Nullable HelmReleasePropertiesDefinitionResponse helmReleaseProperties;

    public Optional<HelmReleasePropertiesDefinitionResponse> getHelmReleaseProperties() {
        return this.helmReleaseProperties == null ? Optional.empty() : Optional.ofNullable(this.helmReleaseProperties);
    }

    @InputImport(name="kind")
    private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="namespace")
    private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    @InputImport(name="statusConditions")
    private final @Nullable List<ObjectStatusConditionDefinitionResponse> statusConditions;

    public List<ObjectStatusConditionDefinitionResponse> getStatusConditions() {
        return this.statusConditions == null ? List.of() : this.statusConditions;
    }

    public ObjectStatusDefinitionResponse(
        @Nullable ObjectReferenceDefinitionResponse appliedBy,
        @Nullable String complianceState,
        @Nullable HelmReleasePropertiesDefinitionResponse helmReleaseProperties,
        @Nullable String kind,
        @Nullable String name,
        @Nullable String namespace,
        @Nullable List<ObjectStatusConditionDefinitionResponse> statusConditions) {
        this.appliedBy = appliedBy;
        this.complianceState = complianceState;
        this.helmReleaseProperties = helmReleaseProperties;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.statusConditions = statusConditions;
    }

    private ObjectStatusDefinitionResponse() {
        this.appliedBy = null;
        this.complianceState = null;
        this.helmReleaseProperties = null;
        this.kind = null;
        this.name = null;
        this.namespace = null;
        this.statusConditions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectStatusDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectReferenceDefinitionResponse appliedBy;
        private @Nullable String complianceState;
        private @Nullable HelmReleasePropertiesDefinitionResponse helmReleaseProperties;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable List<ObjectStatusConditionDefinitionResponse> statusConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectStatusDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedBy = defaults.appliedBy;
    	      this.complianceState = defaults.complianceState;
    	      this.helmReleaseProperties = defaults.helmReleaseProperties;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.statusConditions = defaults.statusConditions;
        }

        public Builder setAppliedBy(@Nullable ObjectReferenceDefinitionResponse appliedBy) {
            this.appliedBy = appliedBy;
            return this;
        }

        public Builder setComplianceState(@Nullable String complianceState) {
            this.complianceState = complianceState;
            return this;
        }

        public Builder setHelmReleaseProperties(@Nullable HelmReleasePropertiesDefinitionResponse helmReleaseProperties) {
            this.helmReleaseProperties = helmReleaseProperties;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setStatusConditions(@Nullable List<ObjectStatusConditionDefinitionResponse> statusConditions) {
            this.statusConditions = statusConditions;
            return this;
        }

        public ObjectStatusDefinitionResponse build() {
            return new ObjectStatusDefinitionResponse(appliedBy, complianceState, helmReleaseProperties, kind, name, namespace, statusConditions);
        }
    }
}
