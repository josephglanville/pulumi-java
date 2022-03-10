// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.aws.alb.outputs.GetListenerDefaultAction;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetListenerResult {
    private final String alpnPolicy;
    private final String arn;
    private final String certificateArn;
    private final List<GetListenerDefaultAction> defaultActions;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String loadBalancerArn;
    private final Integer port;
    private final String protocol;
    private final String sslPolicy;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetListenerResult(
        @OutputCustomType.Parameter("alpnPolicy") String alpnPolicy,
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("certificateArn") String certificateArn,
        @OutputCustomType.Parameter("defaultActions") List<GetListenerDefaultAction> defaultActions,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("loadBalancerArn") String loadBalancerArn,
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("protocol") String protocol,
        @OutputCustomType.Parameter("sslPolicy") String sslPolicy,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.alpnPolicy = alpnPolicy;
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.defaultActions = defaultActions;
        this.id = id;
        this.loadBalancerArn = loadBalancerArn;
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
    }

    public String getAlpnPolicy() {
        return this.alpnPolicy;
    }
    public String getArn() {
        return this.arn;
    }
    public String getCertificateArn() {
        return this.certificateArn;
    }
    public List<GetListenerDefaultAction> getDefaultActions() {
        return this.defaultActions;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getSslPolicy() {
        return this.sslPolicy;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alpnPolicy;
        private String arn;
        private String certificateArn;
        private List<GetListenerDefaultAction> defaultActions;
        private String id;
        private String loadBalancerArn;
        private Integer port;
        private String protocol;
        private String sslPolicy;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.id = defaults.id;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder setAlpnPolicy(String alpnPolicy) {
            this.alpnPolicy = Objects.requireNonNull(alpnPolicy);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCertificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }

        public Builder setDefaultActions(List<GetListenerDefaultAction> defaultActions) {
            this.defaultActions = Objects.requireNonNull(defaultActions);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLoadBalancerArn(String loadBalancerArn) {
            this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetListenerResult build() {
            return new GetListenerResult(alpnPolicy, arn, certificateArn, defaultActions, id, loadBalancerArn, port, protocol, sslPolicy, tags);
        }
    }
}
