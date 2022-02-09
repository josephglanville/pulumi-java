// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionArgs;
import io.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceProxyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemotePrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemotePrivateEndpointArgs Empty = new RemotePrivateEndpointArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="manualPrivateLinkServiceConnections")
    private final @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;

    public Input<List<PrivateLinkServiceConnectionArgs>> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? Input.empty() : this.manualPrivateLinkServiceConnections;
    }

    @InputImport(name="privateLinkServiceConnections")
    private final @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;

    public Input<List<PrivateLinkServiceConnectionArgs>> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? Input.empty() : this.privateLinkServiceConnections;
    }

    @InputImport(name="privateLinkServiceProxies")
    private final @Nullable Input<List<PrivateLinkServiceProxyArgs>> privateLinkServiceProxies;

    public Input<List<PrivateLinkServiceProxyArgs>> getPrivateLinkServiceProxies() {
        return this.privateLinkServiceProxies == null ? Input.empty() : this.privateLinkServiceProxies;
    }

    public RemotePrivateEndpointArgs(
        @Nullable Input<String> id,
        @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections,
        @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections,
        @Nullable Input<List<PrivateLinkServiceProxyArgs>> privateLinkServiceProxies) {
        this.id = id;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.privateLinkServiceProxies = privateLinkServiceProxies;
    }

    private RemotePrivateEndpointArgs() {
        this.id = Input.empty();
        this.manualPrivateLinkServiceConnections = Input.empty();
        this.privateLinkServiceConnections = Input.empty();
        this.privateLinkServiceProxies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemotePrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections;
        private @Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections;
        private @Nullable Input<List<PrivateLinkServiceProxyArgs>> privateLinkServiceProxies;

        public Builder() {
    	      // Empty
        }

        public Builder(RemotePrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.privateLinkServiceProxies = defaults.privateLinkServiceProxies;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable Input<List<PrivateLinkServiceConnectionArgs>> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = Input.ofNullable(manualPrivateLinkServiceConnections);
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable Input<List<PrivateLinkServiceConnectionArgs>> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionArgs> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = Input.ofNullable(privateLinkServiceConnections);
            return this;
        }

        public Builder setPrivateLinkServiceProxies(@Nullable Input<List<PrivateLinkServiceProxyArgs>> privateLinkServiceProxies) {
            this.privateLinkServiceProxies = privateLinkServiceProxies;
            return this;
        }

        public Builder setPrivateLinkServiceProxies(@Nullable List<PrivateLinkServiceProxyArgs> privateLinkServiceProxies) {
            this.privateLinkServiceProxies = Input.ofNullable(privateLinkServiceProxies);
            return this;
        }

        public RemotePrivateEndpointArgs build() {
            return new RemotePrivateEndpointArgs(id, manualPrivateLinkServiceConnections, privateLinkServiceConnections, privateLinkServiceProxies);
        }
    }
}
