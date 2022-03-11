// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2;

import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @InputImport(name="alpnPolicy")
      private final @Nullable Output<String> alpnPolicy;

    public Output<String> getAlpnPolicy() {
        return this.alpnPolicy == null ? Output.empty() : this.alpnPolicy;
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Output.empty() : this.certificateArn;
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @InputImport(name="defaultActions", required=true)
      private final Output<List<ListenerDefaultActionArgs>> defaultActions;

    public Output<List<ListenerDefaultActionArgs>> getDefaultActions() {
        return this.defaultActions;
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerArn", required=true)
      private final Output<String> loadBalancerArn;

    public Output<String> getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> getSslPolicy() {
        return this.sslPolicy == null ? Output.empty() : this.sslPolicy;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ListenerArgs(
        @Nullable Output<String> alpnPolicy,
        @Nullable Output<String> certificateArn,
        Output<List<ListenerDefaultActionArgs>> defaultActions,
        Output<String> loadBalancerArn,
        @Nullable Output<Integer> port,
        @Nullable Output<String> protocol,
        @Nullable Output<String> sslPolicy,
        @Nullable Output<Map<String,String>> tags) {
        this.alpnPolicy = alpnPolicy;
        this.certificateArn = certificateArn;
        this.defaultActions = Objects.requireNonNull(defaultActions, "expected parameter 'defaultActions' to be non-null");
        this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn, "expected parameter 'loadBalancerArn' to be non-null");
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
    }

    private ListenerArgs() {
        this.alpnPolicy = Output.empty();
        this.certificateArn = Output.empty();
        this.defaultActions = Output.empty();
        this.loadBalancerArn = Output.empty();
        this.port = Output.empty();
        this.protocol = Output.empty();
        this.sslPolicy = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alpnPolicy;
        private @Nullable Output<String> certificateArn;
        private Output<List<ListenerDefaultActionArgs>> defaultActions;
        private Output<String> loadBalancerArn;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> sslPolicy;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        public Builder alpnPolicy(@Nullable String alpnPolicy) {
            this.alpnPolicy = Output.ofNullable(alpnPolicy);
            return this;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Output.ofNullable(certificateArn);
            return this;
        }

        public Builder defaultActions(Output<List<ListenerDefaultActionArgs>> defaultActions) {
            this.defaultActions = Objects.requireNonNull(defaultActions);
            return this;
        }

        public Builder defaultActions(List<ListenerDefaultActionArgs> defaultActions) {
            this.defaultActions = Output.of(Objects.requireNonNull(defaultActions));
            return this;
        }

        public Builder loadBalancerArn(Output<String> loadBalancerArn) {
            this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn);
            return this;
        }

        public Builder loadBalancerArn(String loadBalancerArn) {
            this.loadBalancerArn = Output.of(Objects.requireNonNull(loadBalancerArn));
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }

        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Output.ofNullable(sslPolicy);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ListenerArgs build() {
            return new ListenerArgs(alpnPolicy, certificateArn, defaultActions, loadBalancerArn, port, protocol, sslPolicy, tags);
        }
    }
}
