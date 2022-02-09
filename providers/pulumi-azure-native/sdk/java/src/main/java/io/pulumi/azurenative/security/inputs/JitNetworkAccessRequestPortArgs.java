// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.Status;
import io.pulumi.azurenative.security.enums.StatusReason;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JitNetworkAccessRequestPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final JitNetworkAccessRequestPortArgs Empty = new JitNetworkAccessRequestPortArgs();

    @InputImport(name="allowedSourceAddressPrefix")
    private final @Nullable Input<String> allowedSourceAddressPrefix;

    public Input<String> getAllowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix == null ? Input.empty() : this.allowedSourceAddressPrefix;
    }

    @InputImport(name="allowedSourceAddressPrefixes")
    private final @Nullable Input<List<String>> allowedSourceAddressPrefixes;

    public Input<List<String>> getAllowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes == null ? Input.empty() : this.allowedSourceAddressPrefixes;
    }

    @InputImport(name="endTimeUtc", required=true)
    private final Input<String> endTimeUtc;

    public Input<String> getEndTimeUtc() {
        return this.endTimeUtc;
    }

    @InputImport(name="mappedPort")
    private final @Nullable Input<Integer> mappedPort;

    public Input<Integer> getMappedPort() {
        return this.mappedPort == null ? Input.empty() : this.mappedPort;
    }

    @InputImport(name="number", required=true)
    private final Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number;
    }

    @InputImport(name="status", required=true)
    private final Input<Either<String,Status>> status;

    public Input<Either<String,Status>> getStatus() {
        return this.status;
    }

    @InputImport(name="statusReason", required=true)
    private final Input<Either<String,StatusReason>> statusReason;

    public Input<Either<String,StatusReason>> getStatusReason() {
        return this.statusReason;
    }

    public JitNetworkAccessRequestPortArgs(
        @Nullable Input<String> allowedSourceAddressPrefix,
        @Nullable Input<List<String>> allowedSourceAddressPrefixes,
        Input<String> endTimeUtc,
        @Nullable Input<Integer> mappedPort,
        Input<Integer> number,
        Input<Either<String,Status>> status,
        Input<Either<String,StatusReason>> statusReason) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc, "expected parameter 'endTimeUtc' to be non-null");
        this.mappedPort = mappedPort;
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusReason = Objects.requireNonNull(statusReason, "expected parameter 'statusReason' to be non-null");
    }

    private JitNetworkAccessRequestPortArgs() {
        this.allowedSourceAddressPrefix = Input.empty();
        this.allowedSourceAddressPrefixes = Input.empty();
        this.endTimeUtc = Input.empty();
        this.mappedPort = Input.empty();
        this.number = Input.empty();
        this.status = Input.empty();
        this.statusReason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allowedSourceAddressPrefix;
        private @Nullable Input<List<String>> allowedSourceAddressPrefixes;
        private Input<String> endTimeUtc;
        private @Nullable Input<Integer> mappedPort;
        private Input<Integer> number;
        private Input<Either<String,Status>> status;
        private Input<Either<String,StatusReason>> statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSourceAddressPrefix = defaults.allowedSourceAddressPrefix;
    	      this.allowedSourceAddressPrefixes = defaults.allowedSourceAddressPrefixes;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.mappedPort = defaults.mappedPort;
    	      this.number = defaults.number;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder setAllowedSourceAddressPrefix(@Nullable Input<String> allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }

        public Builder setAllowedSourceAddressPrefix(@Nullable String allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = Input.ofNullable(allowedSourceAddressPrefix);
            return this;
        }

        public Builder setAllowedSourceAddressPrefixes(@Nullable Input<List<String>> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }

        public Builder setAllowedSourceAddressPrefixes(@Nullable List<String> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = Input.ofNullable(allowedSourceAddressPrefixes);
            return this;
        }

        public Builder setEndTimeUtc(Input<String> endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }

        public Builder setEndTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Input.of(Objects.requireNonNull(endTimeUtc));
            return this;
        }

        public Builder setMappedPort(@Nullable Input<Integer> mappedPort) {
            this.mappedPort = mappedPort;
            return this;
        }

        public Builder setMappedPort(@Nullable Integer mappedPort) {
            this.mappedPort = Input.ofNullable(mappedPort);
            return this;
        }

        public Builder setNumber(Input<Integer> number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = Input.of(Objects.requireNonNull(number));
            return this;
        }

        public Builder setStatus(Input<Either<String,Status>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(Either<String,Status> status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setStatusReason(Input<Either<String,StatusReason>> statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }

        public Builder setStatusReason(Either<String,StatusReason> statusReason) {
            this.statusReason = Input.of(Objects.requireNonNull(statusReason));
            return this;
        }

        public JitNetworkAccessRequestPortArgs build() {
            return new JitNetworkAccessRequestPortArgs(allowedSourceAddressPrefix, allowedSourceAddressPrefixes, endTimeUtc, mappedPort, number, status, statusReason);
        }
    }
}
