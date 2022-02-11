// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressBackend;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressRule;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressTLS;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressSpec {
    private final @Nullable IngressBackend defaultBackend;
    private final @Nullable String ingressClassName;
    private final @Nullable List<IngressRule> rules;
    private final @Nullable List<IngressTLS> tls;

    @OutputCustomType.Constructor({"defaultBackend","ingressClassName","rules","tls"})
    private IngressSpec(
        @Nullable IngressBackend defaultBackend,
        @Nullable String ingressClassName,
        @Nullable List<IngressRule> rules,
        @Nullable List<IngressTLS> tls) {
        this.defaultBackend = defaultBackend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    public Optional<IngressBackend> getDefaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }
    public Optional<String> getIngressClassName() {
        return Optional.ofNullable(this.ingressClassName);
    }
    public List<IngressRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public List<IngressTLS> getTls() {
        return this.tls == null ? List.of() : this.tls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IngressBackend defaultBackend;
        private @Nullable String ingressClassName;
        private @Nullable List<IngressRule> rules;
        private @Nullable List<IngressTLS> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBackend = defaults.defaultBackend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        public Builder setDefaultBackend(@Nullable IngressBackend defaultBackend) {
            this.defaultBackend = defaultBackend;
            return this;
        }

        public Builder setIngressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }

        public Builder setRules(@Nullable List<IngressRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setTls(@Nullable List<IngressTLS> tls) {
            this.tls = tls;
            return this;
        }

        public IngressSpec build() {
            return new IngressSpec(defaultBackend, ingressClassName, rules, tls);
        }
    }
}
