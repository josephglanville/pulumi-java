// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.GetRouterBgp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouterResult {
    private final List<GetRouterBgp> bgps;
    private final String creationTimestamp;
    private final String description;
    private final Boolean encryptedInterconnectRouter;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String network;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;

    @CustomType.Constructor
    private GetRouterResult(
        @CustomType.Parameter("bgps") List<GetRouterBgp> bgps,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("encryptedInterconnectRouter") Boolean encryptedInterconnectRouter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.bgps = bgps;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.encryptedInterconnectRouter = encryptedInterconnectRouter;
        this.id = id;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    public List<GetRouterBgp> getBgps() {
        return this.bgps;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public Boolean getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRouterBgp> bgps;
        private String creationTimestamp;
        private String description;
        private Boolean encryptedInterconnectRouter;
        private String id;
        private String name;
        private String network;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgps = defaults.bgps;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bgps(List<GetRouterBgp> bgps) {
            this.bgps = Objects.requireNonNull(bgps);
            return this;
        }
        public Builder bgps(GetRouterBgp... bgps) {
            return bgps(List.of(bgps));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder encryptedInterconnectRouter(Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public GetRouterResult build() {
            return new GetRouterResult(bgps, creationTimestamp, description, encryptedInterconnectRouter, id, name, network, project, region, selfLink);
        }
    }
}
