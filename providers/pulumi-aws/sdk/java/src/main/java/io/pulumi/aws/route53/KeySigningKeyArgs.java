// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeySigningKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeySigningKeyArgs Empty = new KeySigningKeyArgs();

    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Import(name="hostedZoneId", required=true)
      private final Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    @Import(name="keyManagementServiceArn", required=true)
      private final Output<String> keyManagementServiceArn;

    public Output<String> getKeyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }

    /**
     * Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public KeySigningKeyArgs(
        Output<String> hostedZoneId,
        Output<String> keyManagementServiceArn,
        @Nullable Output<String> name,
        @Nullable Output<String> status) {
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
        this.keyManagementServiceArn = Objects.requireNonNull(keyManagementServiceArn, "expected parameter 'keyManagementServiceArn' to be non-null");
        this.name = name;
        this.status = status;
    }

    private KeySigningKeyArgs() {
        this.hostedZoneId = Output.empty();
        this.keyManagementServiceArn = Output.empty();
        this.name = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeySigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hostedZoneId;
        private Output<String> keyManagementServiceArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(KeySigningKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.keyManagementServiceArn = defaults.keyManagementServiceArn;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder hostedZoneId(Output<String> hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Output.of(Objects.requireNonNull(hostedZoneId));
            return this;
        }
        public Builder keyManagementServiceArn(Output<String> keyManagementServiceArn) {
            this.keyManagementServiceArn = Objects.requireNonNull(keyManagementServiceArn);
            return this;
        }
        public Builder keyManagementServiceArn(String keyManagementServiceArn) {
            this.keyManagementServiceArn = Output.of(Objects.requireNonNull(keyManagementServiceArn));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public KeySigningKeyArgs build() {
            return new KeySigningKeyArgs(hostedZoneId, keyManagementServiceArn, name, status);
        }
    }
}