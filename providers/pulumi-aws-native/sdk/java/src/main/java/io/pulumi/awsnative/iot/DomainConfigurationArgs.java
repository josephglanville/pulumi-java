// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.DomainConfigurationServiceType;
import io.pulumi.awsnative.iot.enums.DomainConfigurationStatus;
import io.pulumi.awsnative.iot.inputs.DomainConfigurationAuthorizerConfigArgs;
import io.pulumi.awsnative.iot.inputs.DomainConfigurationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainConfigurationArgs Empty = new DomainConfigurationArgs();

    @Import(name="authorizerConfig")
      private final @Nullable Output<DomainConfigurationAuthorizerConfigArgs> authorizerConfig;

    public Output<DomainConfigurationAuthorizerConfigArgs> getAuthorizerConfig() {
        return this.authorizerConfig == null ? Codegen.empty() : this.authorizerConfig;
    }

    @Import(name="domainConfigurationName")
      private final @Nullable Output<String> domainConfigurationName;

    public Output<String> getDomainConfigurationName() {
        return this.domainConfigurationName == null ? Codegen.empty() : this.domainConfigurationName;
    }

    @Import(name="domainConfigurationStatus")
      private final @Nullable Output<DomainConfigurationStatus> domainConfigurationStatus;

    public Output<DomainConfigurationStatus> getDomainConfigurationStatus() {
        return this.domainConfigurationStatus == null ? Codegen.empty() : this.domainConfigurationStatus;
    }

    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    @Import(name="serverCertificateArns")
      private final @Nullable Output<List<String>> serverCertificateArns;

    public Output<List<String>> getServerCertificateArns() {
        return this.serverCertificateArns == null ? Codegen.empty() : this.serverCertificateArns;
    }

    @Import(name="serviceType")
      private final @Nullable Output<DomainConfigurationServiceType> serviceType;

    public Output<DomainConfigurationServiceType> getServiceType() {
        return this.serviceType == null ? Codegen.empty() : this.serviceType;
    }

    @Import(name="tags")
      private final @Nullable Output<List<DomainConfigurationTagArgs>> tags;

    public Output<List<DomainConfigurationTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="validationCertificateArn")
      private final @Nullable Output<String> validationCertificateArn;

    public Output<String> getValidationCertificateArn() {
        return this.validationCertificateArn == null ? Codegen.empty() : this.validationCertificateArn;
    }

    public DomainConfigurationArgs(
        @Nullable Output<DomainConfigurationAuthorizerConfigArgs> authorizerConfig,
        @Nullable Output<String> domainConfigurationName,
        @Nullable Output<DomainConfigurationStatus> domainConfigurationStatus,
        @Nullable Output<String> domainName,
        @Nullable Output<List<String>> serverCertificateArns,
        @Nullable Output<DomainConfigurationServiceType> serviceType,
        @Nullable Output<List<DomainConfigurationTagArgs>> tags,
        @Nullable Output<String> validationCertificateArn) {
        this.authorizerConfig = authorizerConfig;
        this.domainConfigurationName = domainConfigurationName;
        this.domainConfigurationStatus = domainConfigurationStatus;
        this.domainName = domainName;
        this.serverCertificateArns = serverCertificateArns;
        this.serviceType = serviceType;
        this.tags = tags;
        this.validationCertificateArn = validationCertificateArn;
    }

    private DomainConfigurationArgs() {
        this.authorizerConfig = Codegen.empty();
        this.domainConfigurationName = Codegen.empty();
        this.domainConfigurationStatus = Codegen.empty();
        this.domainName = Codegen.empty();
        this.serverCertificateArns = Codegen.empty();
        this.serviceType = Codegen.empty();
        this.tags = Codegen.empty();
        this.validationCertificateArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainConfigurationAuthorizerConfigArgs> authorizerConfig;
        private @Nullable Output<String> domainConfigurationName;
        private @Nullable Output<DomainConfigurationStatus> domainConfigurationStatus;
        private @Nullable Output<String> domainName;
        private @Nullable Output<List<String>> serverCertificateArns;
        private @Nullable Output<DomainConfigurationServiceType> serviceType;
        private @Nullable Output<List<DomainConfigurationTagArgs>> tags;
        private @Nullable Output<String> validationCertificateArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerConfig = defaults.authorizerConfig;
    	      this.domainConfigurationName = defaults.domainConfigurationName;
    	      this.domainConfigurationStatus = defaults.domainConfigurationStatus;
    	      this.domainName = defaults.domainName;
    	      this.serverCertificateArns = defaults.serverCertificateArns;
    	      this.serviceType = defaults.serviceType;
    	      this.tags = defaults.tags;
    	      this.validationCertificateArn = defaults.validationCertificateArn;
        }

        public Builder authorizerConfig(@Nullable Output<DomainConfigurationAuthorizerConfigArgs> authorizerConfig) {
            this.authorizerConfig = authorizerConfig;
            return this;
        }
        public Builder authorizerConfig(@Nullable DomainConfigurationAuthorizerConfigArgs authorizerConfig) {
            this.authorizerConfig = Codegen.ofNullable(authorizerConfig);
            return this;
        }
        public Builder domainConfigurationName(@Nullable Output<String> domainConfigurationName) {
            this.domainConfigurationName = domainConfigurationName;
            return this;
        }
        public Builder domainConfigurationName(@Nullable String domainConfigurationName) {
            this.domainConfigurationName = Codegen.ofNullable(domainConfigurationName);
            return this;
        }
        public Builder domainConfigurationStatus(@Nullable Output<DomainConfigurationStatus> domainConfigurationStatus) {
            this.domainConfigurationStatus = domainConfigurationStatus;
            return this;
        }
        public Builder domainConfigurationStatus(@Nullable DomainConfigurationStatus domainConfigurationStatus) {
            this.domainConfigurationStatus = Codegen.ofNullable(domainConfigurationStatus);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder serverCertificateArns(@Nullable Output<List<String>> serverCertificateArns) {
            this.serverCertificateArns = serverCertificateArns;
            return this;
        }
        public Builder serverCertificateArns(@Nullable List<String> serverCertificateArns) {
            this.serverCertificateArns = Codegen.ofNullable(serverCertificateArns);
            return this;
        }
        public Builder serverCertificateArns(String... serverCertificateArns) {
            return serverCertificateArns(List.of(serverCertificateArns));
        }
        public Builder serviceType(@Nullable Output<DomainConfigurationServiceType> serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Builder serviceType(@Nullable DomainConfigurationServiceType serviceType) {
            this.serviceType = Codegen.ofNullable(serviceType);
            return this;
        }
        public Builder tags(@Nullable Output<List<DomainConfigurationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DomainConfigurationTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DomainConfigurationTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder validationCertificateArn(@Nullable Output<String> validationCertificateArn) {
            this.validationCertificateArn = validationCertificateArn;
            return this;
        }
        public Builder validationCertificateArn(@Nullable String validationCertificateArn) {
            this.validationCertificateArn = Codegen.ofNullable(validationCertificateArn);
            return this;
        }        public DomainConfigurationArgs build() {
            return new DomainConfigurationArgs(authorizerConfig, domainConfigurationName, domainConfigurationStatus, domainName, serverCertificateArns, serviceType, tags, validationCertificateArn);
        }
    }
}
