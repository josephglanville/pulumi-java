// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceAccountSubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountSubjectArgs Empty = new ServiceAccountSubjectArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="namespace", required=true)
    private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    public ServiceAccountSubjectArgs(
        Input<String> name,
        Input<String> namespace) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ServiceAccountSubjectArgs() {
        this.name = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountSubjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public ServiceAccountSubjectArgs build() {
            return new ServiceAccountSubjectArgs(name, namespace);
        }
    }
}
