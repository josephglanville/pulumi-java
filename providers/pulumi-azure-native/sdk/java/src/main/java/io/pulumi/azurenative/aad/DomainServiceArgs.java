// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad;

import io.pulumi.azurenative.aad.enums.FilteredSync;
import io.pulumi.azurenative.aad.inputs.DomainSecuritySettingsArgs;
import io.pulumi.azurenative.aad.inputs.LdapsSettingsArgs;
import io.pulumi.azurenative.aad.inputs.NotificationSettingsArgs;
import io.pulumi.azurenative.aad.inputs.ReplicaSetArgs;
import io.pulumi.azurenative.aad.inputs.ResourceForestSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainServiceArgs Empty = new DomainServiceArgs();

    /**
     * Domain Configuration Type
     * 
     */
    @Import(name="domainConfigurationType")
      private final @Nullable Output<String> domainConfigurationType;

    public Output<String> getDomainConfigurationType() {
        return this.domainConfigurationType == null ? Codegen.empty() : this.domainConfigurationType;
    }

    /**
     * The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * DomainSecurity Settings
     * 
     */
    @Import(name="domainSecuritySettings")
      private final @Nullable Output<DomainSecuritySettingsArgs> domainSecuritySettings;

    public Output<DomainSecuritySettingsArgs> getDomainSecuritySettings() {
        return this.domainSecuritySettings == null ? Codegen.empty() : this.domainSecuritySettings;
    }

    /**
     * The name of the domain service.
     * 
     */
    @Import(name="domainServiceName")
      private final @Nullable Output<String> domainServiceName;

    public Output<String> getDomainServiceName() {
        return this.domainServiceName == null ? Codegen.empty() : this.domainServiceName;
    }

    /**
     * Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    @Import(name="filteredSync")
      private final @Nullable Output<Either<String,FilteredSync>> filteredSync;

    public Output<Either<String,FilteredSync>> getFilteredSync() {
        return this.filteredSync == null ? Codegen.empty() : this.filteredSync;
    }

    /**
     * Secure LDAP Settings
     * 
     */
    @Import(name="ldapsSettings")
      private final @Nullable Output<LdapsSettingsArgs> ldapsSettings;

    public Output<LdapsSettingsArgs> getLdapsSettings() {
        return this.ldapsSettings == null ? Codegen.empty() : this.ldapsSettings;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Notification Settings
     * 
     */
    @Import(name="notificationSettings")
      private final @Nullable Output<NotificationSettingsArgs> notificationSettings;

    public Output<NotificationSettingsArgs> getNotificationSettings() {
        return this.notificationSettings == null ? Codegen.empty() : this.notificationSettings;
    }

    /**
     * List of ReplicaSets
     * 
     */
    @Import(name="replicaSets")
      private final @Nullable Output<List<ReplicaSetArgs>> replicaSets;

    public Output<List<ReplicaSetArgs>> getReplicaSets() {
        return this.replicaSets == null ? Codegen.empty() : this.replicaSets;
    }

    /**
     * Resource Forest Settings
     * 
     */
    @Import(name="resourceForestSettings")
      private final @Nullable Output<ResourceForestSettingsArgs> resourceForestSettings;

    public Output<ResourceForestSettingsArgs> getResourceForestSettings() {
        return this.resourceForestSettings == null ? Codegen.empty() : this.resourceForestSettings;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sku Type
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<String> sku;

    public Output<String> getSku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DomainServiceArgs(
        @Nullable Output<String> domainConfigurationType,
        @Nullable Output<String> domainName,
        @Nullable Output<DomainSecuritySettingsArgs> domainSecuritySettings,
        @Nullable Output<String> domainServiceName,
        @Nullable Output<Either<String,FilteredSync>> filteredSync,
        @Nullable Output<LdapsSettingsArgs> ldapsSettings,
        @Nullable Output<String> location,
        @Nullable Output<NotificationSettingsArgs> notificationSettings,
        @Nullable Output<List<ReplicaSetArgs>> replicaSets,
        @Nullable Output<ResourceForestSettingsArgs> resourceForestSettings,
        Output<String> resourceGroupName,
        @Nullable Output<String> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.domainConfigurationType = domainConfigurationType;
        this.domainName = domainName;
        this.domainSecuritySettings = domainSecuritySettings;
        this.domainServiceName = domainServiceName;
        this.filteredSync = filteredSync;
        this.ldapsSettings = ldapsSettings;
        this.location = location;
        this.notificationSettings = notificationSettings;
        this.replicaSets = replicaSets;
        this.resourceForestSettings = resourceForestSettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private DomainServiceArgs() {
        this.domainConfigurationType = Codegen.empty();
        this.domainName = Codegen.empty();
        this.domainSecuritySettings = Codegen.empty();
        this.domainServiceName = Codegen.empty();
        this.filteredSync = Codegen.empty();
        this.ldapsSettings = Codegen.empty();
        this.location = Codegen.empty();
        this.notificationSettings = Codegen.empty();
        this.replicaSets = Codegen.empty();
        this.resourceForestSettings = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainConfigurationType;
        private @Nullable Output<String> domainName;
        private @Nullable Output<DomainSecuritySettingsArgs> domainSecuritySettings;
        private @Nullable Output<String> domainServiceName;
        private @Nullable Output<Either<String,FilteredSync>> filteredSync;
        private @Nullable Output<LdapsSettingsArgs> ldapsSettings;
        private @Nullable Output<String> location;
        private @Nullable Output<NotificationSettingsArgs> notificationSettings;
        private @Nullable Output<List<ReplicaSetArgs>> replicaSets;
        private @Nullable Output<ResourceForestSettingsArgs> resourceForestSettings;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainConfigurationType = defaults.domainConfigurationType;
    	      this.domainName = defaults.domainName;
    	      this.domainSecuritySettings = defaults.domainSecuritySettings;
    	      this.domainServiceName = defaults.domainServiceName;
    	      this.filteredSync = defaults.filteredSync;
    	      this.ldapsSettings = defaults.ldapsSettings;
    	      this.location = defaults.location;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.replicaSets = defaults.replicaSets;
    	      this.resourceForestSettings = defaults.resourceForestSettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder domainConfigurationType(@Nullable Output<String> domainConfigurationType) {
            this.domainConfigurationType = domainConfigurationType;
            return this;
        }
        public Builder domainConfigurationType(@Nullable String domainConfigurationType) {
            this.domainConfigurationType = Codegen.ofNullable(domainConfigurationType);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder domainSecuritySettings(@Nullable Output<DomainSecuritySettingsArgs> domainSecuritySettings) {
            this.domainSecuritySettings = domainSecuritySettings;
            return this;
        }
        public Builder domainSecuritySettings(@Nullable DomainSecuritySettingsArgs domainSecuritySettings) {
            this.domainSecuritySettings = Codegen.ofNullable(domainSecuritySettings);
            return this;
        }
        public Builder domainServiceName(@Nullable Output<String> domainServiceName) {
            this.domainServiceName = domainServiceName;
            return this;
        }
        public Builder domainServiceName(@Nullable String domainServiceName) {
            this.domainServiceName = Codegen.ofNullable(domainServiceName);
            return this;
        }
        public Builder filteredSync(@Nullable Output<Either<String,FilteredSync>> filteredSync) {
            this.filteredSync = filteredSync;
            return this;
        }
        public Builder filteredSync(@Nullable Either<String,FilteredSync> filteredSync) {
            this.filteredSync = Codegen.ofNullable(filteredSync);
            return this;
        }
        public Builder ldapsSettings(@Nullable Output<LdapsSettingsArgs> ldapsSettings) {
            this.ldapsSettings = ldapsSettings;
            return this;
        }
        public Builder ldapsSettings(@Nullable LdapsSettingsArgs ldapsSettings) {
            this.ldapsSettings = Codegen.ofNullable(ldapsSettings);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder notificationSettings(@Nullable Output<NotificationSettingsArgs> notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsArgs notificationSettings) {
            this.notificationSettings = Codegen.ofNullable(notificationSettings);
            return this;
        }
        public Builder replicaSets(@Nullable Output<List<ReplicaSetArgs>> replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public Builder replicaSets(@Nullable List<ReplicaSetArgs> replicaSets) {
            this.replicaSets = Codegen.ofNullable(replicaSets);
            return this;
        }
        public Builder replicaSets(ReplicaSetArgs... replicaSets) {
            return replicaSets(List.of(replicaSets));
        }
        public Builder resourceForestSettings(@Nullable Output<ResourceForestSettingsArgs> resourceForestSettings) {
            this.resourceForestSettings = resourceForestSettings;
            return this;
        }
        public Builder resourceForestSettings(@Nullable ResourceForestSettingsArgs resourceForestSettings) {
            this.resourceForestSettings = Codegen.ofNullable(resourceForestSettings);
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
        public Builder sku(@Nullable Output<String> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DomainServiceArgs build() {
            return new DomainServiceArgs(domainConfigurationType, domainName, domainSecuritySettings, domainServiceName, filteredSync, ldapsSettings, location, notificationSettings, replicaSets, resourceForestSettings, resourceGroupName, sku, tags);
        }
    }
}
