// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 * 
 */
public final class ServiceAccountSubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountSubjectArgs Empty = new ServiceAccountSubjectArgs();

    /**
     * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    public ServiceAccountSubjectArgs(
        Output<String> name,
        Output<String> namespace) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ServiceAccountSubjectArgs() {
        this.name = Output.empty();
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountSubjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }        public ServiceAccountSubjectArgs build() {
            return new ServiceAccountSubjectArgs(name, namespace);
        }
    }
}
