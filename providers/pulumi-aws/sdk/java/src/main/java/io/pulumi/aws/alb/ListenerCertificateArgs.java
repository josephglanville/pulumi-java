// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListenerCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerCertificateArgs Empty = new ListenerCertificateArgs();

    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @Import(name="certificateArn", required=true)
      private final Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @Import(name="listenerArn", required=true)
      private final Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn;
    }

    public ListenerCertificateArgs(
        Output<String> certificateArn,
        Output<String> listenerArn) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
    }

    private ListenerCertificateArgs() {
        this.certificateArn = Output.empty();
        this.listenerArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateArn;
        private Output<String> listenerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.listenerArn = defaults.listenerArn;
        }

        public Builder certificateArn(Output<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Output.of(Objects.requireNonNull(certificateArn));
            return this;
        }
        public Builder listenerArn(Output<String> listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }
        public Builder listenerArn(String listenerArn) {
            this.listenerArn = Output.of(Objects.requireNonNull(listenerArn));
            return this;
        }        public ListenerCertificateArgs build() {
            return new ListenerCertificateArgs(certificateArn, listenerArn);
        }
    }
}