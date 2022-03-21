// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeUsageDataEventHubResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdgeUsageDataEventHubResponse Empty = new EdgeUsageDataEventHubResponse();

    /**
     * Name of the Event Hub where usage will be reported.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the Event Hub where usage will be reported.
     * 
     */
    @Import(name="namespace")
      private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    /**
     * SAS token needed to interact with Event Hub.
     * 
     */
    @Import(name="token")
      private final @Nullable String token;

    public Optional<String> getToken() {
        return this.token == null ? Optional.empty() : Optional.ofNullable(this.token);
    }

    public EdgeUsageDataEventHubResponse(
        @Nullable String name,
        @Nullable String namespace,
        @Nullable String token) {
        this.name = name;
        this.namespace = namespace;
        this.token = token;
    }

    private EdgeUsageDataEventHubResponse() {
        this.name = null;
        this.namespace = null;
        this.token = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeUsageDataEventHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeUsageDataEventHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.token = defaults.token;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }        public EdgeUsageDataEventHubResponse build() {
            return new EdgeUsageDataEventHubResponse(name, namespace, token);
        }
    }
}
