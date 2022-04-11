// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameDomainNameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameDomainNameConfigurationArgs Empty = new DomainNameDomainNameConfigurationArgs();

    /**
     * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
     * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
     * 
     */
    @Import(name="certificateArn", required=true)
      private final Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * The endpoint type. Valid values: `REGIONAL`.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * 
     */
    @Import(name="hostedZoneId")
      private final @Nullable Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Codegen.empty() : this.hostedZoneId;
    }

    /**
     * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
     * 
     */
    @Import(name="securityPolicy", required=true)
      private final Output<String> securityPolicy;

    public Output<String> getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * The target domain name.
     * 
     */
    @Import(name="targetDomainName")
      private final @Nullable Output<String> targetDomainName;

    public Output<String> getTargetDomainName() {
        return this.targetDomainName == null ? Codegen.empty() : this.targetDomainName;
    }

    public DomainNameDomainNameConfigurationArgs(
        Output<String> certificateArn,
        Output<String> endpointType,
        @Nullable Output<String> hostedZoneId,
        Output<String> securityPolicy,
        @Nullable Output<String> targetDomainName) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.hostedZoneId = hostedZoneId;
        this.securityPolicy = Objects.requireNonNull(securityPolicy, "expected parameter 'securityPolicy' to be non-null");
        this.targetDomainName = targetDomainName;
    }

    private DomainNameDomainNameConfigurationArgs() {
        this.certificateArn = Codegen.empty();
        this.endpointType = Codegen.empty();
        this.hostedZoneId = Codegen.empty();
        this.securityPolicy = Codegen.empty();
        this.targetDomainName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameDomainNameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateArn;
        private Output<String> endpointType;
        private @Nullable Output<String> hostedZoneId;
        private Output<String> securityPolicy;
        private @Nullable Output<String> targetDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameDomainNameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.endpointType = defaults.endpointType;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.targetDomainName = defaults.targetDomainName;
        }

        public Builder certificateArn(Output<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Output.of(Objects.requireNonNull(certificateArn));
            return this;
        }
        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }
        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Codegen.ofNullable(hostedZoneId);
            return this;
        }
        public Builder securityPolicy(Output<String> securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        public Builder securityPolicy(String securityPolicy) {
            this.securityPolicy = Output.of(Objects.requireNonNull(securityPolicy));
            return this;
        }
        public Builder targetDomainName(@Nullable Output<String> targetDomainName) {
            this.targetDomainName = targetDomainName;
            return this;
        }
        public Builder targetDomainName(@Nullable String targetDomainName) {
            this.targetDomainName = Codegen.ofNullable(targetDomainName);
            return this;
        }        public DomainNameDomainNameConfigurationArgs build() {
            return new DomainNameDomainNameConfigurationArgs(certificateArn, endpointType, hostedZoneId, securityPolicy, targetDomainName);
        }
    }
}
