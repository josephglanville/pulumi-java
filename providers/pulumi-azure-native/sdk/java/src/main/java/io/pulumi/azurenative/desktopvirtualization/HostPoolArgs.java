// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.enums.HostPoolType;
import io.pulumi.azurenative.desktopvirtualization.enums.LoadBalancerType;
import io.pulumi.azurenative.desktopvirtualization.enums.PersonalDesktopAssignmentType;
import io.pulumi.azurenative.desktopvirtualization.enums.PreferredAppGroupType;
import io.pulumi.azurenative.desktopvirtualization.enums.SSOSecretType;
import io.pulumi.azurenative.desktopvirtualization.inputs.MigrationRequestPropertiesArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.RegistrationInfoArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetIdentityArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetPlanArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetSkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostPoolArgs Empty = new HostPoolArgs();

    /**
     * Custom rdp property of HostPool.
     * 
     */
    @Import(name="customRdpProperty")
      private final @Nullable Output<String> customRdpProperty;

    public Output<String> getCustomRdpProperty() {
        return this.customRdpProperty == null ? Output.empty() : this.customRdpProperty;
    }

    /**
     * Description of HostPool.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Friendly name of HostPool.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @Import(name="hostPoolName")
      private final @Nullable Output<String> hostPoolName;

    public Output<String> getHostPoolName() {
        return this.hostPoolName == null ? Output.empty() : this.hostPoolName;
    }

    /**
     * HostPool type for desktop.
     * 
     */
    @Import(name="hostPoolType", required=true)
      private final Output<Either<String,HostPoolType>> hostPoolType;

    public Output<Either<String,HostPoolType>> getHostPoolType() {
        return this.hostPoolType;
    }

    @Import(name="identity")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity;

    public Output<ResourceModelWithAllowedPropertySetIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The type of the load balancer.
     * 
     */
    @Import(name="loadBalancerType", required=true)
      private final Output<Either<String,LoadBalancerType>> loadBalancerType;

    public Output<Either<String,LoadBalancerType>> getLoadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @Import(name="managedBy")
      private final @Nullable Output<String> managedBy;

    public Output<String> getManagedBy() {
        return this.managedBy == null ? Output.empty() : this.managedBy;
    }

    /**
     * The max session limit of HostPool.
     * 
     */
    @Import(name="maxSessionLimit")
      private final @Nullable Output<Integer> maxSessionLimit;

    public Output<Integer> getMaxSessionLimit() {
        return this.maxSessionLimit == null ? Output.empty() : this.maxSessionLimit;
    }

    /**
     * The registration info of HostPool.
     * 
     */
    @Import(name="migrationRequest")
      private final @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest;

    public Output<MigrationRequestPropertiesArgs> getMigrationRequest() {
        return this.migrationRequest == null ? Output.empty() : this.migrationRequest;
    }

    /**
     * PersonalDesktopAssignment type for HostPool.
     * 
     */
    @Import(name="personalDesktopAssignmentType")
      private final @Nullable Output<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType;

    public Output<Either<String,PersonalDesktopAssignmentType>> getPersonalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType == null ? Output.empty() : this.personalDesktopAssignmentType;
    }

    @Import(name="plan")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan;

    public Output<ResourceModelWithAllowedPropertySetPlanArgs> getPlan() {
        return this.plan == null ? Output.empty() : this.plan;
    }

    /**
     * The type of preferred application group type, default to Desktop Application Group
     * 
     */
    @Import(name="preferredAppGroupType", required=true)
      private final Output<Either<String,PreferredAppGroupType>> preferredAppGroupType;

    public Output<Either<String,PreferredAppGroupType>> getPreferredAppGroupType() {
        return this.preferredAppGroupType;
    }

    /**
     * The registration info of HostPool.
     * 
     */
    @Import(name="registrationInfo")
      private final @Nullable Output<RegistrationInfoArgs> registrationInfo;

    public Output<RegistrationInfoArgs> getRegistrationInfo() {
        return this.registrationInfo == null ? Output.empty() : this.registrationInfo;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ring number of HostPool.
     * 
     */
    @Import(name="ring")
      private final @Nullable Output<Integer> ring;

    public Output<Integer> getRing() {
        return this.ring == null ? Output.empty() : this.ring;
    }

    @Import(name="sku")
      private final @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku;

    public Output<ResourceModelWithAllowedPropertySetSkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * ClientId for the registered Relying Party used to issue WVD SSO certificates.
     * 
     */
    @Import(name="ssoClientId")
      private final @Nullable Output<String> ssoClientId;

    public Output<String> getSsoClientId() {
        return this.ssoClientId == null ? Output.empty() : this.ssoClientId;
    }

    /**
     * Path to Azure KeyVault storing the secret used for communication to ADFS.
     * 
     */
    @Import(name="ssoClientSecretKeyVaultPath")
      private final @Nullable Output<String> ssoClientSecretKeyVaultPath;

    public Output<String> getSsoClientSecretKeyVaultPath() {
        return this.ssoClientSecretKeyVaultPath == null ? Output.empty() : this.ssoClientSecretKeyVaultPath;
    }

    /**
     * The type of single sign on Secret Type.
     * 
     */
    @Import(name="ssoSecretType")
      private final @Nullable Output<Either<String,SSOSecretType>> ssoSecretType;

    public Output<Either<String,SSOSecretType>> getSsoSecretType() {
        return this.ssoSecretType == null ? Output.empty() : this.ssoSecretType;
    }

    /**
     * URL to customer ADFS server for signing WVD SSO certificates.
     * 
     */
    @Import(name="ssoadfsAuthority")
      private final @Nullable Output<String> ssoadfsAuthority;

    public Output<String> getSsoadfsAuthority() {
        return this.ssoadfsAuthority == null ? Output.empty() : this.ssoadfsAuthority;
    }

    /**
     * The flag to turn on/off StartVMOnConnect feature.
     * 
     */
    @Import(name="startVMOnConnect")
      private final @Nullable Output<Boolean> startVMOnConnect;

    public Output<Boolean> getStartVMOnConnect() {
        return this.startVMOnConnect == null ? Output.empty() : this.startVMOnConnect;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Is validation environment.
     * 
     */
    @Import(name="validationEnvironment")
      private final @Nullable Output<Boolean> validationEnvironment;

    public Output<Boolean> getValidationEnvironment() {
        return this.validationEnvironment == null ? Output.empty() : this.validationEnvironment;
    }

    /**
     * VM template for sessionhosts configuration within hostpool.
     * 
     */
    @Import(name="vmTemplate")
      private final @Nullable Output<String> vmTemplate;

    public Output<String> getVmTemplate() {
        return this.vmTemplate == null ? Output.empty() : this.vmTemplate;
    }

    public HostPoolArgs(
        @Nullable Output<String> customRdpProperty,
        @Nullable Output<String> description,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> hostPoolName,
        Output<Either<String,HostPoolType>> hostPoolType,
        @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity,
        @Nullable Output<String> kind,
        Output<Either<String,LoadBalancerType>> loadBalancerType,
        @Nullable Output<String> location,
        @Nullable Output<String> managedBy,
        @Nullable Output<Integer> maxSessionLimit,
        @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest,
        @Nullable Output<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType,
        @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan,
        Output<Either<String,PreferredAppGroupType>> preferredAppGroupType,
        @Nullable Output<RegistrationInfoArgs> registrationInfo,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> ring,
        @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku,
        @Nullable Output<String> ssoClientId,
        @Nullable Output<String> ssoClientSecretKeyVaultPath,
        @Nullable Output<Either<String,SSOSecretType>> ssoSecretType,
        @Nullable Output<String> ssoadfsAuthority,
        @Nullable Output<Boolean> startVMOnConnect,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Boolean> validationEnvironment,
        @Nullable Output<String> vmTemplate) {
        this.customRdpProperty = customRdpProperty;
        this.description = description;
        this.friendlyName = friendlyName;
        this.hostPoolName = hostPoolName;
        this.hostPoolType = Objects.requireNonNull(hostPoolType, "expected parameter 'hostPoolType' to be non-null");
        this.identity = identity;
        this.kind = kind;
        this.loadBalancerType = Objects.requireNonNull(loadBalancerType, "expected parameter 'loadBalancerType' to be non-null");
        this.location = location;
        this.managedBy = managedBy;
        this.maxSessionLimit = maxSessionLimit;
        this.migrationRequest = migrationRequest;
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        this.plan = plan;
        this.preferredAppGroupType = Objects.requireNonNull(preferredAppGroupType, "expected parameter 'preferredAppGroupType' to be non-null");
        this.registrationInfo = registrationInfo;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ring = ring;
        this.sku = sku;
        this.ssoClientId = ssoClientId;
        this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
        this.ssoSecretType = ssoSecretType;
        this.ssoadfsAuthority = ssoadfsAuthority;
        this.startVMOnConnect = startVMOnConnect;
        this.tags = tags;
        this.validationEnvironment = validationEnvironment;
        this.vmTemplate = vmTemplate;
    }

    private HostPoolArgs() {
        this.customRdpProperty = Output.empty();
        this.description = Output.empty();
        this.friendlyName = Output.empty();
        this.hostPoolName = Output.empty();
        this.hostPoolType = Output.empty();
        this.identity = Output.empty();
        this.kind = Output.empty();
        this.loadBalancerType = Output.empty();
        this.location = Output.empty();
        this.managedBy = Output.empty();
        this.maxSessionLimit = Output.empty();
        this.migrationRequest = Output.empty();
        this.personalDesktopAssignmentType = Output.empty();
        this.plan = Output.empty();
        this.preferredAppGroupType = Output.empty();
        this.registrationInfo = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ring = Output.empty();
        this.sku = Output.empty();
        this.ssoClientId = Output.empty();
        this.ssoClientSecretKeyVaultPath = Output.empty();
        this.ssoSecretType = Output.empty();
        this.ssoadfsAuthority = Output.empty();
        this.startVMOnConnect = Output.empty();
        this.tags = Output.empty();
        this.validationEnvironment = Output.empty();
        this.vmTemplate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customRdpProperty;
        private @Nullable Output<String> description;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> hostPoolName;
        private Output<Either<String,HostPoolType>> hostPoolType;
        private @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity;
        private @Nullable Output<String> kind;
        private Output<Either<String,LoadBalancerType>> loadBalancerType;
        private @Nullable Output<String> location;
        private @Nullable Output<String> managedBy;
        private @Nullable Output<Integer> maxSessionLimit;
        private @Nullable Output<MigrationRequestPropertiesArgs> migrationRequest;
        private @Nullable Output<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType;
        private @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan;
        private Output<Either<String,PreferredAppGroupType>> preferredAppGroupType;
        private @Nullable Output<RegistrationInfoArgs> registrationInfo;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> ring;
        private @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku;
        private @Nullable Output<String> ssoClientId;
        private @Nullable Output<String> ssoClientSecretKeyVaultPath;
        private @Nullable Output<Either<String,SSOSecretType>> ssoSecretType;
        private @Nullable Output<String> ssoadfsAuthority;
        private @Nullable Output<Boolean> startVMOnConnect;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Boolean> validationEnvironment;
        private @Nullable Output<String> vmTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(HostPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRdpProperty = defaults.customRdpProperty;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostPoolName = defaults.hostPoolName;
    	      this.hostPoolType = defaults.hostPoolType;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.maxSessionLimit = defaults.maxSessionLimit;
    	      this.migrationRequest = defaults.migrationRequest;
    	      this.personalDesktopAssignmentType = defaults.personalDesktopAssignmentType;
    	      this.plan = defaults.plan;
    	      this.preferredAppGroupType = defaults.preferredAppGroupType;
    	      this.registrationInfo = defaults.registrationInfo;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ring = defaults.ring;
    	      this.sku = defaults.sku;
    	      this.ssoClientId = defaults.ssoClientId;
    	      this.ssoClientSecretKeyVaultPath = defaults.ssoClientSecretKeyVaultPath;
    	      this.ssoSecretType = defaults.ssoSecretType;
    	      this.ssoadfsAuthority = defaults.ssoadfsAuthority;
    	      this.startVMOnConnect = defaults.startVMOnConnect;
    	      this.tags = defaults.tags;
    	      this.validationEnvironment = defaults.validationEnvironment;
    	      this.vmTemplate = defaults.vmTemplate;
        }

        public Builder customRdpProperty(@Nullable Output<String> customRdpProperty) {
            this.customRdpProperty = customRdpProperty;
            return this;
        }
        public Builder customRdpProperty(@Nullable String customRdpProperty) {
            this.customRdpProperty = Output.ofNullable(customRdpProperty);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }
        public Builder hostPoolName(@Nullable Output<String> hostPoolName) {
            this.hostPoolName = hostPoolName;
            return this;
        }
        public Builder hostPoolName(@Nullable String hostPoolName) {
            this.hostPoolName = Output.ofNullable(hostPoolName);
            return this;
        }
        public Builder hostPoolType(Output<Either<String,HostPoolType>> hostPoolType) {
            this.hostPoolType = Objects.requireNonNull(hostPoolType);
            return this;
        }
        public Builder hostPoolType(Either<String,HostPoolType> hostPoolType) {
            this.hostPoolType = Output.of(Objects.requireNonNull(hostPoolType));
            return this;
        }
        public Builder identity(@Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ResourceModelWithAllowedPropertySetIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder loadBalancerType(Output<Either<String,LoadBalancerType>> loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public Builder loadBalancerType(Either<String,LoadBalancerType> loadBalancerType) {
            this.loadBalancerType = Output.of(Objects.requireNonNull(loadBalancerType));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder managedBy(@Nullable Output<String> managedBy) {
            this.managedBy = managedBy;
            return this;
        }
        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = Output.ofNullable(managedBy);
            return this;
        }
        public Builder maxSessionLimit(@Nullable Output<Integer> maxSessionLimit) {
            this.maxSessionLimit = maxSessionLimit;
            return this;
        }
        public Builder maxSessionLimit(@Nullable Integer maxSessionLimit) {
            this.maxSessionLimit = Output.ofNullable(maxSessionLimit);
            return this;
        }
        public Builder migrationRequest(@Nullable Output<MigrationRequestPropertiesArgs> migrationRequest) {
            this.migrationRequest = migrationRequest;
            return this;
        }
        public Builder migrationRequest(@Nullable MigrationRequestPropertiesArgs migrationRequest) {
            this.migrationRequest = Output.ofNullable(migrationRequest);
            return this;
        }
        public Builder personalDesktopAssignmentType(@Nullable Output<Either<String,PersonalDesktopAssignmentType>> personalDesktopAssignmentType) {
            this.personalDesktopAssignmentType = personalDesktopAssignmentType;
            return this;
        }
        public Builder personalDesktopAssignmentType(@Nullable Either<String,PersonalDesktopAssignmentType> personalDesktopAssignmentType) {
            this.personalDesktopAssignmentType = Output.ofNullable(personalDesktopAssignmentType);
            return this;
        }
        public Builder plan(@Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan) {
            this.plan = plan;
            return this;
        }
        public Builder plan(@Nullable ResourceModelWithAllowedPropertySetPlanArgs plan) {
            this.plan = Output.ofNullable(plan);
            return this;
        }
        public Builder preferredAppGroupType(Output<Either<String,PreferredAppGroupType>> preferredAppGroupType) {
            this.preferredAppGroupType = Objects.requireNonNull(preferredAppGroupType);
            return this;
        }
        public Builder preferredAppGroupType(Either<String,PreferredAppGroupType> preferredAppGroupType) {
            this.preferredAppGroupType = Output.of(Objects.requireNonNull(preferredAppGroupType));
            return this;
        }
        public Builder registrationInfo(@Nullable Output<RegistrationInfoArgs> registrationInfo) {
            this.registrationInfo = registrationInfo;
            return this;
        }
        public Builder registrationInfo(@Nullable RegistrationInfoArgs registrationInfo) {
            this.registrationInfo = Output.ofNullable(registrationInfo);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ring(@Nullable Output<Integer> ring) {
            this.ring = ring;
            return this;
        }
        public Builder ring(@Nullable Integer ring) {
            this.ring = Output.ofNullable(ring);
            return this;
        }
        public Builder sku(@Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable ResourceModelWithAllowedPropertySetSkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }
        public Builder ssoClientId(@Nullable Output<String> ssoClientId) {
            this.ssoClientId = ssoClientId;
            return this;
        }
        public Builder ssoClientId(@Nullable String ssoClientId) {
            this.ssoClientId = Output.ofNullable(ssoClientId);
            return this;
        }
        public Builder ssoClientSecretKeyVaultPath(@Nullable Output<String> ssoClientSecretKeyVaultPath) {
            this.ssoClientSecretKeyVaultPath = ssoClientSecretKeyVaultPath;
            return this;
        }
        public Builder ssoClientSecretKeyVaultPath(@Nullable String ssoClientSecretKeyVaultPath) {
            this.ssoClientSecretKeyVaultPath = Output.ofNullable(ssoClientSecretKeyVaultPath);
            return this;
        }
        public Builder ssoSecretType(@Nullable Output<Either<String,SSOSecretType>> ssoSecretType) {
            this.ssoSecretType = ssoSecretType;
            return this;
        }
        public Builder ssoSecretType(@Nullable Either<String,SSOSecretType> ssoSecretType) {
            this.ssoSecretType = Output.ofNullable(ssoSecretType);
            return this;
        }
        public Builder ssoadfsAuthority(@Nullable Output<String> ssoadfsAuthority) {
            this.ssoadfsAuthority = ssoadfsAuthority;
            return this;
        }
        public Builder ssoadfsAuthority(@Nullable String ssoadfsAuthority) {
            this.ssoadfsAuthority = Output.ofNullable(ssoadfsAuthority);
            return this;
        }
        public Builder startVMOnConnect(@Nullable Output<Boolean> startVMOnConnect) {
            this.startVMOnConnect = startVMOnConnect;
            return this;
        }
        public Builder startVMOnConnect(@Nullable Boolean startVMOnConnect) {
            this.startVMOnConnect = Output.ofNullable(startVMOnConnect);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder validationEnvironment(@Nullable Output<Boolean> validationEnvironment) {
            this.validationEnvironment = validationEnvironment;
            return this;
        }
        public Builder validationEnvironment(@Nullable Boolean validationEnvironment) {
            this.validationEnvironment = Output.ofNullable(validationEnvironment);
            return this;
        }
        public Builder vmTemplate(@Nullable Output<String> vmTemplate) {
            this.vmTemplate = vmTemplate;
            return this;
        }
        public Builder vmTemplate(@Nullable String vmTemplate) {
            this.vmTemplate = Output.ofNullable(vmTemplate);
            return this;
        }        public HostPoolArgs build() {
            return new HostPoolArgs(customRdpProperty, description, friendlyName, hostPoolName, hostPoolType, identity, kind, loadBalancerType, location, managedBy, maxSessionLimit, migrationRequest, personalDesktopAssignmentType, plan, preferredAppGroupType, registrationInfo, resourceGroupName, ring, sku, ssoClientId, ssoClientSecretKeyVaultPath, ssoSecretType, ssoadfsAuthority, startVMOnConnect, tags, validationEnvironment, vmTemplate);
        }
    }
}
