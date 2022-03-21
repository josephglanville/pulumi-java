// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceReference {
    /**
     * name is the name of the service. Required
     * 
     */
    private final String name;
    /**
     * namespace is the namespace of the service. Required
     * 
     */
    private final String namespace;
    /**
     * path is an optional URL path at which the webhook will be contacted.
     * 
     */
    private final @Nullable String path;
    /**
     * port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
     */
    private final @Nullable Integer port;

    @CustomType.Constructor
    private ServiceReference(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable Integer port) {
        this.name = name;
        this.namespace = namespace;
        this.path = path;
        this.port = port;
    }

    /**
     * name is the name of the service. Required
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * namespace is the namespace of the service. Required
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * path is an optional URL path at which the webhook will be contacted.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * port is an optional service port at which the webhook will be contacted. `port` should be a valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private @Nullable String path;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }        public ServiceReference build() {
            return new ServiceReference(name, namespace, path, port);
        }
    }
}
