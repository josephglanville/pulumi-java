// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RouterBgpGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterState extends io.pulumi.resources.ResourceArgs {

    public static final RouterState Empty = new RouterState();

    /**
     * BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bgp")
      private final @Nullable Output<RouterBgpGetArgs> bgp;

    public Output<RouterBgpGetArgs> getBgp() {
        return this.bgp == null ? Output.empty() : this.bgp;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * User-specified description for the IP range.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    @InputImport(name="encryptedInterconnectRouter")
      private final @Nullable Output<Boolean> encryptedInterconnectRouter;

    public Output<Boolean> getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter == null ? Output.empty() : this.encryptedInterconnectRouter;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A reference to the network to which this router belongs.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Region where the router resides.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    public RouterState(
        @Nullable Output<RouterBgpGetArgs> bgp,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> encryptedInterconnectRouter,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink) {
        this.bgp = bgp;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.encryptedInterconnectRouter = encryptedInterconnectRouter;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    private RouterState() {
        this.bgp = Output.empty();
        this.creationTimestamp = Output.empty();
        this.description = Output.empty();
        this.encryptedInterconnectRouter = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.selfLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RouterBgpGetArgs> bgp;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> encryptedInterconnectRouter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bgp(@Nullable Output<RouterBgpGetArgs> bgp) {
            this.bgp = bgp;
            return this;
        }

        public Builder bgp(@Nullable RouterBgpGetArgs bgp) {
            this.bgp = Output.ofNullable(bgp);
            return this;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
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

        public Builder encryptedInterconnectRouter(@Nullable Output<Boolean> encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = encryptedInterconnectRouter;
            return this;
        }

        public Builder encryptedInterconnectRouter(@Nullable Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Output.ofNullable(encryptedInterconnectRouter);
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

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public RouterState build() {
            return new RouterState(bgp, creationTimestamp, description, encryptedInterconnectRouter, name, network, project, region, selfLink);
        }
    }
}
