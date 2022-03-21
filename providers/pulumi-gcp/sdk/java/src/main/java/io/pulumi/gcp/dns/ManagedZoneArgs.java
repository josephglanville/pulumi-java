// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs;
import io.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs;
import io.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs;
import io.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs;
import io.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneArgs Empty = new ManagedZoneArgs();

    /**
     * A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    @Import(name="dnsName", required=true)
      private final Output<String> dnsName;

    public Output<String> getDnsName() {
        return this.dnsName;
    }

    /**
     * DNSSEC configuration
     * Structure is documented below.
     * 
     */
    @Import(name="dnssecConfig")
      private final @Nullable Output<ManagedZoneDnssecConfigArgs> dnssecConfig;

    public Output<ManagedZoneDnssecConfigArgs> getDnssecConfig() {
        return this.dnssecConfig == null ? Output.empty() : this.dnssecConfig;
    }

    /**
     * Set this true to delete all records in the zone.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    @Import(name="forwardingConfig")
      private final @Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig;

    public Output<ManagedZoneForwardingConfigArgs> getForwardingConfig() {
        return this.forwardingConfig == null ? Output.empty() : this.forwardingConfig;
    }

    /**
     * A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    @Import(name="peeringConfig")
      private final @Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig;

    public Output<ManagedZonePeeringConfigArgs> getPeeringConfig() {
        return this.peeringConfig == null ? Output.empty() : this.peeringConfig;
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    @Import(name="privateVisibilityConfig")
      private final @Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig;

    public Output<ManagedZonePrivateVisibilityConfigArgs> getPrivateVisibilityConfig() {
        return this.privateVisibilityConfig == null ? Output.empty() : this.privateVisibilityConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    @Import(name="reverseLookup")
      private final @Nullable Output<Boolean> reverseLookup;

    public Output<Boolean> getReverseLookup() {
        return this.reverseLookup == null ? Output.empty() : this.reverseLookup;
    }

    /**
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Import(name="serviceDirectoryConfig")
      private final @Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig;

    public Output<ManagedZoneServiceDirectoryConfigArgs> getServiceDirectoryConfig() {
        return this.serviceDirectoryConfig == null ? Output.empty() : this.serviceDirectoryConfig;
    }

    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    @Import(name="visibility")
      private final @Nullable Output<String> visibility;

    public Output<String> getVisibility() {
        return this.visibility == null ? Output.empty() : this.visibility;
    }

    public ManagedZoneArgs(
        @Nullable Output<String> description,
        Output<String> dnsName,
        @Nullable Output<ManagedZoneDnssecConfigArgs> dnssecConfig,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig,
        @Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> reverseLookup,
        @Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig,
        @Nullable Output<String> visibility) {
        this.description = description == null ? Output.ofNullable("Managed by Pulumi") : description;
        this.dnsName = Objects.requireNonNull(dnsName, "expected parameter 'dnsName' to be non-null");
        this.dnssecConfig = dnssecConfig;
        this.forceDestroy = forceDestroy;
        this.forwardingConfig = forwardingConfig;
        this.labels = labels;
        this.name = name;
        this.peeringConfig = peeringConfig;
        this.privateVisibilityConfig = privateVisibilityConfig;
        this.project = project;
        this.reverseLookup = reverseLookup;
        this.serviceDirectoryConfig = serviceDirectoryConfig;
        this.visibility = visibility;
    }

    private ManagedZoneArgs() {
        this.description = Output.empty();
        this.dnsName = Output.empty();
        this.dnssecConfig = Output.empty();
        this.forceDestroy = Output.empty();
        this.forwardingConfig = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.peeringConfig = Output.empty();
        this.privateVisibilityConfig = Output.empty();
        this.project = Output.empty();
        this.reverseLookup = Output.empty();
        this.serviceDirectoryConfig = Output.empty();
        this.visibility = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> dnsName;
        private @Nullable Output<ManagedZoneDnssecConfigArgs> dnssecConfig;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig;
        private @Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> reverseLookup;
        private @Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig;
        private @Nullable Output<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.dnssecConfig = defaults.dnssecConfig;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.forwardingConfig = defaults.forwardingConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.peeringConfig = defaults.peeringConfig;
    	      this.privateVisibilityConfig = defaults.privateVisibilityConfig;
    	      this.project = defaults.project;
    	      this.reverseLookup = defaults.reverseLookup;
    	      this.serviceDirectoryConfig = defaults.serviceDirectoryConfig;
    	      this.visibility = defaults.visibility;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder dnsName(Output<String> dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Output.of(Objects.requireNonNull(dnsName));
            return this;
        }
        public Builder dnssecConfig(@Nullable Output<ManagedZoneDnssecConfigArgs> dnssecConfig) {
            this.dnssecConfig = dnssecConfig;
            return this;
        }
        public Builder dnssecConfig(@Nullable ManagedZoneDnssecConfigArgs dnssecConfig) {
            this.dnssecConfig = Output.ofNullable(dnssecConfig);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder forwardingConfig(@Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig) {
            this.forwardingConfig = forwardingConfig;
            return this;
        }
        public Builder forwardingConfig(@Nullable ManagedZoneForwardingConfigArgs forwardingConfig) {
            this.forwardingConfig = Output.ofNullable(forwardingConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder peeringConfig(@Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig) {
            this.peeringConfig = peeringConfig;
            return this;
        }
        public Builder peeringConfig(@Nullable ManagedZonePeeringConfigArgs peeringConfig) {
            this.peeringConfig = Output.ofNullable(peeringConfig);
            return this;
        }
        public Builder privateVisibilityConfig(@Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig) {
            this.privateVisibilityConfig = privateVisibilityConfig;
            return this;
        }
        public Builder privateVisibilityConfig(@Nullable ManagedZonePrivateVisibilityConfigArgs privateVisibilityConfig) {
            this.privateVisibilityConfig = Output.ofNullable(privateVisibilityConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder reverseLookup(@Nullable Output<Boolean> reverseLookup) {
            this.reverseLookup = reverseLookup;
            return this;
        }
        public Builder reverseLookup(@Nullable Boolean reverseLookup) {
            this.reverseLookup = Output.ofNullable(reverseLookup);
            return this;
        }
        public Builder serviceDirectoryConfig(@Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig) {
            this.serviceDirectoryConfig = serviceDirectoryConfig;
            return this;
        }
        public Builder serviceDirectoryConfig(@Nullable ManagedZoneServiceDirectoryConfigArgs serviceDirectoryConfig) {
            this.serviceDirectoryConfig = Output.ofNullable(serviceDirectoryConfig);
            return this;
        }
        public Builder visibility(@Nullable Output<String> visibility) {
            this.visibility = visibility;
            return this;
        }
        public Builder visibility(@Nullable String visibility) {
            this.visibility = Output.ofNullable(visibility);
            return this;
        }        public ManagedZoneArgs build() {
            return new ManagedZoneArgs(description, dnsName, dnssecConfig, forceDestroy, forwardingConfig, labels, name, peeringConfig, privateVisibilityConfig, project, reverseLookup, serviceDirectoryConfig, visibility);
        }
    }
}
