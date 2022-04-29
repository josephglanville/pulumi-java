// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetWaasPolicyWafConfigAddressRateLimiting {
    /**
     * @return The number of allowed requests per second from one IP address. If unspecified, defaults to `1`.
     * 
     */
    private final Integer allowedRatePerAddress;
    /**
     * @return The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    private final Integer blockResponseCode;
    /**
     * @return Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return The maximum number of requests allowed to be queued before subsequent requests are dropped. If unspecified, defaults to `10`.
     * 
     */
    private final Integer maxDelayedCountPerAddress;

    @CustomType.Constructor
    private GetWaasPolicyWafConfigAddressRateLimiting(
        @CustomType.Parameter("allowedRatePerAddress") Integer allowedRatePerAddress,
        @CustomType.Parameter("blockResponseCode") Integer blockResponseCode,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("maxDelayedCountPerAddress") Integer maxDelayedCountPerAddress) {
        this.allowedRatePerAddress = allowedRatePerAddress;
        this.blockResponseCode = blockResponseCode;
        this.isEnabled = isEnabled;
        this.maxDelayedCountPerAddress = maxDelayedCountPerAddress;
    }

    /**
     * @return The number of allowed requests per second from one IP address. If unspecified, defaults to `1`.
     * 
     */
    public Integer allowedRatePerAddress() {
        return this.allowedRatePerAddress;
    }
    /**
     * @return The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    public Integer blockResponseCode() {
        return this.blockResponseCode;
    }
    /**
     * @return Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The maximum number of requests allowed to be queued before subsequent requests are dropped. If unspecified, defaults to `10`.
     * 
     */
    public Integer maxDelayedCountPerAddress() {
        return this.maxDelayedCountPerAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaasPolicyWafConfigAddressRateLimiting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer allowedRatePerAddress;
        private Integer blockResponseCode;
        private Boolean isEnabled;
        private Integer maxDelayedCountPerAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWaasPolicyWafConfigAddressRateLimiting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRatePerAddress = defaults.allowedRatePerAddress;
    	      this.blockResponseCode = defaults.blockResponseCode;
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxDelayedCountPerAddress = defaults.maxDelayedCountPerAddress;
        }

        public Builder allowedRatePerAddress(Integer allowedRatePerAddress) {
            this.allowedRatePerAddress = Objects.requireNonNull(allowedRatePerAddress);
            return this;
        }
        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = Objects.requireNonNull(blockResponseCode);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder maxDelayedCountPerAddress(Integer maxDelayedCountPerAddress) {
            this.maxDelayedCountPerAddress = Objects.requireNonNull(maxDelayedCountPerAddress);
            return this;
        }        public GetWaasPolicyWafConfigAddressRateLimiting build() {
            return new GetWaasPolicyWafConfigAddressRateLimiting(allowedRatePerAddress, blockResponseCode, isEnabled, maxDelayedCountPerAddress);
        }
    }
}
