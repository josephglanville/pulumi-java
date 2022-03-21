// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerListenerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerListenerGetArgs Empty = new LoadBalancerListenerGetArgs();

    /**
     * The port on the instance to route to
     * 
     */
    @Import(name="instancePort", required=true)
      private final Output<Integer> instancePort;

    public Output<Integer> getInstancePort() {
        return this.instancePort;
    }

    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @Import(name="instanceProtocol", required=true)
      private final Output<String> instanceProtocol;

    public Output<String> getInstanceProtocol() {
        return this.instanceProtocol;
    }

    /**
     * The port to listen on for the load balancer
     * 
     */
    @Import(name="lbPort", required=true)
      private final Output<Integer> lbPort;

    public Output<Integer> getLbPort() {
        return this.lbPort;
    }

    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @Import(name="lbProtocol", required=true)
      private final Output<String> lbProtocol;

    public Output<String> getLbProtocol() {
        return this.lbProtocol;
    }

    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    @Import(name="sslCertificateId")
      private final @Nullable Output<String> sslCertificateId;

    public Output<String> getSslCertificateId() {
        return this.sslCertificateId == null ? Output.empty() : this.sslCertificateId;
    }

    public LoadBalancerListenerGetArgs(
        Output<Integer> instancePort,
        Output<String> instanceProtocol,
        Output<Integer> lbPort,
        Output<String> lbProtocol,
        @Nullable Output<String> sslCertificateId) {
        this.instancePort = Objects.requireNonNull(instancePort, "expected parameter 'instancePort' to be non-null");
        this.instanceProtocol = Objects.requireNonNull(instanceProtocol, "expected parameter 'instanceProtocol' to be non-null");
        this.lbPort = Objects.requireNonNull(lbPort, "expected parameter 'lbPort' to be non-null");
        this.lbProtocol = Objects.requireNonNull(lbProtocol, "expected parameter 'lbProtocol' to be non-null");
        this.sslCertificateId = sslCertificateId;
    }

    private LoadBalancerListenerGetArgs() {
        this.instancePort = Output.empty();
        this.instanceProtocol = Output.empty();
        this.lbPort = Output.empty();
        this.lbProtocol = Output.empty();
        this.sslCertificateId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerListenerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> instancePort;
        private Output<String> instanceProtocol;
        private Output<Integer> lbPort;
        private Output<String> lbProtocol;
        private @Nullable Output<String> sslCertificateId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerListenerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.instanceProtocol = defaults.instanceProtocol;
    	      this.lbPort = defaults.lbPort;
    	      this.lbProtocol = defaults.lbProtocol;
    	      this.sslCertificateId = defaults.sslCertificateId;
        }

        public Builder instancePort(Output<Integer> instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }
        public Builder instancePort(Integer instancePort) {
            this.instancePort = Output.of(Objects.requireNonNull(instancePort));
            return this;
        }
        public Builder instanceProtocol(Output<String> instanceProtocol) {
            this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
            return this;
        }
        public Builder instanceProtocol(String instanceProtocol) {
            this.instanceProtocol = Output.of(Objects.requireNonNull(instanceProtocol));
            return this;
        }
        public Builder lbPort(Output<Integer> lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }
        public Builder lbPort(Integer lbPort) {
            this.lbPort = Output.of(Objects.requireNonNull(lbPort));
            return this;
        }
        public Builder lbProtocol(Output<String> lbProtocol) {
            this.lbProtocol = Objects.requireNonNull(lbProtocol);
            return this;
        }
        public Builder lbProtocol(String lbProtocol) {
            this.lbProtocol = Output.of(Objects.requireNonNull(lbProtocol));
            return this;
        }
        public Builder sslCertificateId(@Nullable Output<String> sslCertificateId) {
            this.sslCertificateId = sslCertificateId;
            return this;
        }
        public Builder sslCertificateId(@Nullable String sslCertificateId) {
            this.sslCertificateId = Output.ofNullable(sslCertificateId);
            return this;
        }        public LoadBalancerListenerGetArgs build() {
            return new LoadBalancerListenerGetArgs(instancePort, instanceProtocol, lbPort, lbProtocol, sslCertificateId);
        }
    }
}
