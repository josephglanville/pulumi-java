// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp {
    private @Nullable String authorizations;
    private @Nullable String clientId;
    private @Nullable Boolean customHeader;
    private @Nullable Boolean enableEs256;
    private @Nullable Boolean enableRs256;
    private @Nullable Boolean extractAuthorizations;
    private @Nullable Boolean extractClientId;
    private @Nullable String extractLocation;
    private @Nullable Boolean extractUserName;
    private @Nullable String headerName;
    private @Nullable String jwt;
    private @Nullable Boolean locked;
    private @Nullable String primaryLocation;
    private @Nullable String queryParameterName;
    private @Nullable String templateUuid;
    private @Nullable String userName;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp() {}
    public Optional<String> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<Boolean> customHeader() {
        return Optional.ofNullable(this.customHeader);
    }
    public Optional<Boolean> enableEs256() {
        return Optional.ofNullable(this.enableEs256);
    }
    public Optional<Boolean> enableRs256() {
        return Optional.ofNullable(this.enableRs256);
    }
    public Optional<Boolean> extractAuthorizations() {
        return Optional.ofNullable(this.extractAuthorizations);
    }
    public Optional<Boolean> extractClientId() {
        return Optional.ofNullable(this.extractClientId);
    }
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }
    public Optional<Boolean> extractUserName() {
        return Optional.ofNullable(this.extractUserName);
    }
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    public Optional<String> jwt() {
        return Optional.ofNullable(this.jwt);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> primaryLocation() {
        return Optional.ofNullable(this.primaryLocation);
    }
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authorizations;
        private @Nullable String clientId;
        private @Nullable Boolean customHeader;
        private @Nullable Boolean enableEs256;
        private @Nullable Boolean enableRs256;
        private @Nullable Boolean extractAuthorizations;
        private @Nullable Boolean extractClientId;
        private @Nullable String extractLocation;
        private @Nullable Boolean extractUserName;
        private @Nullable String headerName;
        private @Nullable String jwt;
        private @Nullable Boolean locked;
        private @Nullable String primaryLocation;
        private @Nullable String queryParameterName;
        private @Nullable String templateUuid;
        private @Nullable String userName;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.clientId = defaults.clientId;
    	      this.customHeader = defaults.customHeader;
    	      this.enableEs256 = defaults.enableEs256;
    	      this.enableRs256 = defaults.enableRs256;
    	      this.extractAuthorizations = defaults.extractAuthorizations;
    	      this.extractClientId = defaults.extractClientId;
    	      this.extractLocation = defaults.extractLocation;
    	      this.extractUserName = defaults.extractUserName;
    	      this.headerName = defaults.headerName;
    	      this.jwt = defaults.jwt;
    	      this.locked = defaults.locked;
    	      this.primaryLocation = defaults.primaryLocation;
    	      this.queryParameterName = defaults.queryParameterName;
    	      this.templateUuid = defaults.templateUuid;
    	      this.userName = defaults.userName;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder authorizations(@Nullable String authorizations) {

            this.authorizations = authorizations;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder customHeader(@Nullable Boolean customHeader) {

            this.customHeader = customHeader;
            return this;
        }
        @CustomType.Setter
        public Builder enableEs256(@Nullable Boolean enableEs256) {

            this.enableEs256 = enableEs256;
            return this;
        }
        @CustomType.Setter
        public Builder enableRs256(@Nullable Boolean enableRs256) {

            this.enableRs256 = enableRs256;
            return this;
        }
        @CustomType.Setter
        public Builder extractAuthorizations(@Nullable Boolean extractAuthorizations) {

            this.extractAuthorizations = extractAuthorizations;
            return this;
        }
        @CustomType.Setter
        public Builder extractClientId(@Nullable Boolean extractClientId) {

            this.extractClientId = extractClientId;
            return this;
        }
        @CustomType.Setter
        public Builder extractLocation(@Nullable String extractLocation) {

            this.extractLocation = extractLocation;
            return this;
        }
        @CustomType.Setter
        public Builder extractUserName(@Nullable Boolean extractUserName) {

            this.extractUserName = extractUserName;
            return this;
        }
        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {

            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder jwt(@Nullable String jwt) {

            this.jwt = jwt;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder primaryLocation(@Nullable String primaryLocation) {

            this.primaryLocation = primaryLocation;
            return this;
        }
        @CustomType.Setter
        public Builder queryParameterName(@Nullable String queryParameterName) {

            this.queryParameterName = queryParameterName;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {

            this.userName = userName;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorVerifyJsonWebTokenForDcp();
            _resultValue.authorizations = authorizations;
            _resultValue.clientId = clientId;
            _resultValue.customHeader = customHeader;
            _resultValue.enableEs256 = enableEs256;
            _resultValue.enableRs256 = enableRs256;
            _resultValue.extractAuthorizations = extractAuthorizations;
            _resultValue.extractClientId = extractClientId;
            _resultValue.extractLocation = extractLocation;
            _resultValue.extractUserName = extractUserName;
            _resultValue.headerName = headerName;
            _resultValue.jwt = jwt;
            _resultValue.locked = locked;
            _resultValue.primaryLocation = primaryLocation;
            _resultValue.queryParameterName = queryParameterName;
            _resultValue.templateUuid = templateUuid;
            _resultValue.userName = userName;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
