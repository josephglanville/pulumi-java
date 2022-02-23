// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressBackendArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressRuleArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressTLSArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressSpec describes the Ingress the user wishes to exist.
 * 
 */
public final class IngressSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressSpecArgs Empty = new IngressSpecArgs();

    /**
     * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     * 
     */
    @InputImport(name="backend")
      private final @Nullable Input<IngressBackendArgs> backend;

    public Input<IngressBackendArgs> getBackend() {
        return this.backend == null ? Input.empty() : this.backend;
    }

    /**
     * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    @InputImport(name="ingressClassName")
      private final @Nullable Input<String> ingressClassName;

    public Input<String> getIngressClassName() {
        return this.ingressClassName == null ? Input.empty() : this.ingressClassName;
    }

    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<IngressRuleArgs>> rules;

    public Input<List<IngressRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    @InputImport(name="tls")
      private final @Nullable Input<List<IngressTLSArgs>> tls;

    public Input<List<IngressTLSArgs>> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    public IngressSpecArgs(
        @Nullable Input<IngressBackendArgs> backend,
        @Nullable Input<String> ingressClassName,
        @Nullable Input<List<IngressRuleArgs>> rules,
        @Nullable Input<List<IngressTLSArgs>> tls) {
        this.backend = backend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    private IngressSpecArgs() {
        this.backend = Input.empty();
        this.ingressClassName = Input.empty();
        this.rules = Input.empty();
        this.tls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IngressBackendArgs> backend;
        private @Nullable Input<String> ingressClassName;
        private @Nullable Input<List<IngressRuleArgs>> rules;
        private @Nullable Input<List<IngressTLSArgs>> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        public Builder setBackend(@Nullable Input<IngressBackendArgs> backend) {
            this.backend = backend;
            return this;
        }

        public Builder setBackend(@Nullable IngressBackendArgs backend) {
            this.backend = Input.ofNullable(backend);
            return this;
        }

        public Builder setIngressClassName(@Nullable Input<String> ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        public Builder setIngressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = Input.ofNullable(ingressClassName);
            return this;
        }

        public Builder setRules(@Nullable Input<List<IngressRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<IngressRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setTls(@Nullable Input<List<IngressTLSArgs>> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable List<IngressTLSArgs> tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }
        public IngressSpecArgs build() {
            return new IngressSpecArgs(backend, ingressClassName, rules, tls);
        }
    }
}
