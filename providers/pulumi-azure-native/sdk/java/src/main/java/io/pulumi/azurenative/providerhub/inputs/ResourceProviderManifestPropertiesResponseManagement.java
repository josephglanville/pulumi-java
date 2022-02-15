// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceProviderManifestPropertiesResponseManagement extends io.pulumi.resources.InvokeArgs {

    public static final ResourceProviderManifestPropertiesResponseManagement Empty = new ResourceProviderManifestPropertiesResponseManagement();

    @InputImport(name="incidentContactEmail")
    private final @Nullable String incidentContactEmail;

    public Optional<String> getIncidentContactEmail() {
        return this.incidentContactEmail == null ? Optional.empty() : Optional.ofNullable(this.incidentContactEmail);
    }

    @InputImport(name="incidentRoutingService")
    private final @Nullable String incidentRoutingService;

    public Optional<String> getIncidentRoutingService() {
        return this.incidentRoutingService == null ? Optional.empty() : Optional.ofNullable(this.incidentRoutingService);
    }

    @InputImport(name="incidentRoutingTeam")
    private final @Nullable String incidentRoutingTeam;

    public Optional<String> getIncidentRoutingTeam() {
        return this.incidentRoutingTeam == null ? Optional.empty() : Optional.ofNullable(this.incidentRoutingTeam);
    }

    @InputImport(name="manifestOwners")
    private final @Nullable List<String> manifestOwners;

    public List<String> getManifestOwners() {
        return this.manifestOwners == null ? List.of() : this.manifestOwners;
    }

    @InputImport(name="resourceAccessPolicy")
    private final @Nullable String resourceAccessPolicy;

    public Optional<String> getResourceAccessPolicy() {
        return this.resourceAccessPolicy == null ? Optional.empty() : Optional.ofNullable(this.resourceAccessPolicy);
    }

    @InputImport(name="resourceAccessRoles")
    private final @Nullable List<Object> resourceAccessRoles;

    public List<Object> getResourceAccessRoles() {
        return this.resourceAccessRoles == null ? List.of() : this.resourceAccessRoles;
    }

    @InputImport(name="schemaOwners")
    private final @Nullable List<String> schemaOwners;

    public List<String> getSchemaOwners() {
        return this.schemaOwners == null ? List.of() : this.schemaOwners;
    }

    @InputImport(name="serviceTreeInfos")
    private final @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;

    public List<ServiceTreeInfoResponse> getServiceTreeInfos() {
        return this.serviceTreeInfos == null ? List.of() : this.serviceTreeInfos;
    }

    public ResourceProviderManifestPropertiesResponseManagement(
        @Nullable String incidentContactEmail,
        @Nullable String incidentRoutingService,
        @Nullable String incidentRoutingTeam,
        @Nullable List<String> manifestOwners,
        @Nullable String resourceAccessPolicy,
        @Nullable List<Object> resourceAccessRoles,
        @Nullable List<String> schemaOwners,
        @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos) {
        this.incidentContactEmail = incidentContactEmail;
        this.incidentRoutingService = incidentRoutingService;
        this.incidentRoutingTeam = incidentRoutingTeam;
        this.manifestOwners = manifestOwners;
        this.resourceAccessPolicy = resourceAccessPolicy;
        this.resourceAccessRoles = resourceAccessRoles;
        this.schemaOwners = schemaOwners;
        this.serviceTreeInfos = serviceTreeInfos;
    }

    private ResourceProviderManifestPropertiesResponseManagement() {
        this.incidentContactEmail = null;
        this.incidentRoutingService = null;
        this.incidentRoutingTeam = null;
        this.manifestOwners = List.of();
        this.resourceAccessPolicy = null;
        this.resourceAccessRoles = List.of();
        this.schemaOwners = List.of();
        this.serviceTreeInfos = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesResponseManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String incidentContactEmail;
        private @Nullable String incidentRoutingService;
        private @Nullable String incidentRoutingTeam;
        private @Nullable List<String> manifestOwners;
        private @Nullable String resourceAccessPolicy;
        private @Nullable List<Object> resourceAccessRoles;
        private @Nullable List<String> schemaOwners;
        private @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesResponseManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentContactEmail = defaults.incidentContactEmail;
    	      this.incidentRoutingService = defaults.incidentRoutingService;
    	      this.incidentRoutingTeam = defaults.incidentRoutingTeam;
    	      this.manifestOwners = defaults.manifestOwners;
    	      this.resourceAccessPolicy = defaults.resourceAccessPolicy;
    	      this.resourceAccessRoles = defaults.resourceAccessRoles;
    	      this.schemaOwners = defaults.schemaOwners;
    	      this.serviceTreeInfos = defaults.serviceTreeInfos;
        }

        public Builder setIncidentContactEmail(@Nullable String incidentContactEmail) {
            this.incidentContactEmail = incidentContactEmail;
            return this;
        }

        public Builder setIncidentRoutingService(@Nullable String incidentRoutingService) {
            this.incidentRoutingService = incidentRoutingService;
            return this;
        }

        public Builder setIncidentRoutingTeam(@Nullable String incidentRoutingTeam) {
            this.incidentRoutingTeam = incidentRoutingTeam;
            return this;
        }

        public Builder setManifestOwners(@Nullable List<String> manifestOwners) {
            this.manifestOwners = manifestOwners;
            return this;
        }

        public Builder setResourceAccessPolicy(@Nullable String resourceAccessPolicy) {
            this.resourceAccessPolicy = resourceAccessPolicy;
            return this;
        }

        public Builder setResourceAccessRoles(@Nullable List<Object> resourceAccessRoles) {
            this.resourceAccessRoles = resourceAccessRoles;
            return this;
        }

        public Builder setSchemaOwners(@Nullable List<String> schemaOwners) {
            this.schemaOwners = schemaOwners;
            return this;
        }

        public Builder setServiceTreeInfos(@Nullable List<ServiceTreeInfoResponse> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }

        public ResourceProviderManifestPropertiesResponseManagement build() {
            return new ResourceProviderManifestPropertiesResponseManagement(incidentContactEmail, incidentRoutingService, incidentRoutingTeam, manifestOwners, resourceAccessPolicy, resourceAccessRoles, schemaOwners, serviceTreeInfos);
        }
    }
}