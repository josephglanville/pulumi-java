// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationPenaltyNetStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation {
    private @Nullable Boolean allowLargePostBody;
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy cloudletPolicy;
    private @Nullable Boolean enabled;
    private @Nullable String failure302Uri;
    private @Nullable String label;
    private @Nullable Boolean locked;
    private @Nullable String penalty302Uri;
    private @Nullable String penalty403NetStoragePath;
    private @Nullable String penaltyAction;
    private @Nullable Integer penaltyBrandedDenyCacheTtl;
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationPenaltyNetStorage penaltyNetStorage;
    private @Nullable Integer penaltyThreshold;
    private @Nullable String penaltyTitle;
    private @Nullable Boolean resetOnValid;
    private @Nullable String templateUuid;
    private @Nullable Boolean userIdentificationByCookie;
    private @Nullable Boolean userIdentificationByHeaders;
    private @Nullable Boolean userIdentificationByIp;
    private @Nullable Boolean userIdentificationByParams;
    private @Nullable String userIdentificationKeyCookie;
    private @Nullable List<String> userIdentificationKeyHeaders;
    private @Nullable List<String> userIdentificationKeyParams;
    private @Nullable String userIdentificationTitle;
    private @Nullable String uuid;
    private @Nullable String validateOnOriginHeaderName;
    private @Nullable String validateOnOriginHeaderValue;
    private @Nullable Integer validateOnOriginResponseCode;
    private @Nullable String validateOnOriginWith;
    private @Nullable String validationTitle;

    private GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation() {}
    public Optional<Boolean> allowLargePostBody() {
        return Optional.ofNullable(this.allowLargePostBody);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> failure302Uri() {
        return Optional.ofNullable(this.failure302Uri);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> penalty302Uri() {
        return Optional.ofNullable(this.penalty302Uri);
    }
    public Optional<String> penalty403NetStoragePath() {
        return Optional.ofNullable(this.penalty403NetStoragePath);
    }
    public Optional<String> penaltyAction() {
        return Optional.ofNullable(this.penaltyAction);
    }
    public Optional<Integer> penaltyBrandedDenyCacheTtl() {
        return Optional.ofNullable(this.penaltyBrandedDenyCacheTtl);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationPenaltyNetStorage> penaltyNetStorage() {
        return Optional.ofNullable(this.penaltyNetStorage);
    }
    public Optional<Integer> penaltyThreshold() {
        return Optional.ofNullable(this.penaltyThreshold);
    }
    public Optional<String> penaltyTitle() {
        return Optional.ofNullable(this.penaltyTitle);
    }
    public Optional<Boolean> resetOnValid() {
        return Optional.ofNullable(this.resetOnValid);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> userIdentificationByCookie() {
        return Optional.ofNullable(this.userIdentificationByCookie);
    }
    public Optional<Boolean> userIdentificationByHeaders() {
        return Optional.ofNullable(this.userIdentificationByHeaders);
    }
    public Optional<Boolean> userIdentificationByIp() {
        return Optional.ofNullable(this.userIdentificationByIp);
    }
    public Optional<Boolean> userIdentificationByParams() {
        return Optional.ofNullable(this.userIdentificationByParams);
    }
    public Optional<String> userIdentificationKeyCookie() {
        return Optional.ofNullable(this.userIdentificationKeyCookie);
    }
    public List<String> userIdentificationKeyHeaders() {
        return this.userIdentificationKeyHeaders == null ? List.of() : this.userIdentificationKeyHeaders;
    }
    public List<String> userIdentificationKeyParams() {
        return this.userIdentificationKeyParams == null ? List.of() : this.userIdentificationKeyParams;
    }
    public Optional<String> userIdentificationTitle() {
        return Optional.ofNullable(this.userIdentificationTitle);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> validateOnOriginHeaderName() {
        return Optional.ofNullable(this.validateOnOriginHeaderName);
    }
    public Optional<String> validateOnOriginHeaderValue() {
        return Optional.ofNullable(this.validateOnOriginHeaderValue);
    }
    public Optional<Integer> validateOnOriginResponseCode() {
        return Optional.ofNullable(this.validateOnOriginResponseCode);
    }
    public Optional<String> validateOnOriginWith() {
        return Optional.ofNullable(this.validateOnOriginWith);
    }
    public Optional<String> validationTitle() {
        return Optional.ofNullable(this.validationTitle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowLargePostBody;
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy cloudletPolicy;
        private @Nullable Boolean enabled;
        private @Nullable String failure302Uri;
        private @Nullable String label;
        private @Nullable Boolean locked;
        private @Nullable String penalty302Uri;
        private @Nullable String penalty403NetStoragePath;
        private @Nullable String penaltyAction;
        private @Nullable Integer penaltyBrandedDenyCacheTtl;
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationPenaltyNetStorage penaltyNetStorage;
        private @Nullable Integer penaltyThreshold;
        private @Nullable String penaltyTitle;
        private @Nullable Boolean resetOnValid;
        private @Nullable String templateUuid;
        private @Nullable Boolean userIdentificationByCookie;
        private @Nullable Boolean userIdentificationByHeaders;
        private @Nullable Boolean userIdentificationByIp;
        private @Nullable Boolean userIdentificationByParams;
        private @Nullable String userIdentificationKeyCookie;
        private @Nullable List<String> userIdentificationKeyHeaders;
        private @Nullable List<String> userIdentificationKeyParams;
        private @Nullable String userIdentificationTitle;
        private @Nullable String uuid;
        private @Nullable String validateOnOriginHeaderName;
        private @Nullable String validateOnOriginHeaderValue;
        private @Nullable Integer validateOnOriginResponseCode;
        private @Nullable String validateOnOriginWith;
        private @Nullable String validationTitle;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLargePostBody = defaults.allowLargePostBody;
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.enabled = defaults.enabled;
    	      this.failure302Uri = defaults.failure302Uri;
    	      this.label = defaults.label;
    	      this.locked = defaults.locked;
    	      this.penalty302Uri = defaults.penalty302Uri;
    	      this.penalty403NetStoragePath = defaults.penalty403NetStoragePath;
    	      this.penaltyAction = defaults.penaltyAction;
    	      this.penaltyBrandedDenyCacheTtl = defaults.penaltyBrandedDenyCacheTtl;
    	      this.penaltyNetStorage = defaults.penaltyNetStorage;
    	      this.penaltyThreshold = defaults.penaltyThreshold;
    	      this.penaltyTitle = defaults.penaltyTitle;
    	      this.resetOnValid = defaults.resetOnValid;
    	      this.templateUuid = defaults.templateUuid;
    	      this.userIdentificationByCookie = defaults.userIdentificationByCookie;
    	      this.userIdentificationByHeaders = defaults.userIdentificationByHeaders;
    	      this.userIdentificationByIp = defaults.userIdentificationByIp;
    	      this.userIdentificationByParams = defaults.userIdentificationByParams;
    	      this.userIdentificationKeyCookie = defaults.userIdentificationKeyCookie;
    	      this.userIdentificationKeyHeaders = defaults.userIdentificationKeyHeaders;
    	      this.userIdentificationKeyParams = defaults.userIdentificationKeyParams;
    	      this.userIdentificationTitle = defaults.userIdentificationTitle;
    	      this.uuid = defaults.uuid;
    	      this.validateOnOriginHeaderName = defaults.validateOnOriginHeaderName;
    	      this.validateOnOriginHeaderValue = defaults.validateOnOriginHeaderValue;
    	      this.validateOnOriginResponseCode = defaults.validateOnOriginResponseCode;
    	      this.validateOnOriginWith = defaults.validateOnOriginWith;
    	      this.validationTitle = defaults.validationTitle;
        }

        @CustomType.Setter
        public Builder allowLargePostBody(@Nullable Boolean allowLargePostBody) {

            this.allowLargePostBody = allowLargePostBody;
            return this;
        }
        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationCloudletPolicy cloudletPolicy) {

            this.cloudletPolicy = cloudletPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder failure302Uri(@Nullable String failure302Uri) {

            this.failure302Uri = failure302Uri;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder penalty302Uri(@Nullable String penalty302Uri) {

            this.penalty302Uri = penalty302Uri;
            return this;
        }
        @CustomType.Setter
        public Builder penalty403NetStoragePath(@Nullable String penalty403NetStoragePath) {

            this.penalty403NetStoragePath = penalty403NetStoragePath;
            return this;
        }
        @CustomType.Setter
        public Builder penaltyAction(@Nullable String penaltyAction) {

            this.penaltyAction = penaltyAction;
            return this;
        }
        @CustomType.Setter
        public Builder penaltyBrandedDenyCacheTtl(@Nullable Integer penaltyBrandedDenyCacheTtl) {

            this.penaltyBrandedDenyCacheTtl = penaltyBrandedDenyCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder penaltyNetStorage(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorInputValidationPenaltyNetStorage penaltyNetStorage) {

            this.penaltyNetStorage = penaltyNetStorage;
            return this;
        }
        @CustomType.Setter
        public Builder penaltyThreshold(@Nullable Integer penaltyThreshold) {

            this.penaltyThreshold = penaltyThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder penaltyTitle(@Nullable String penaltyTitle) {

            this.penaltyTitle = penaltyTitle;
            return this;
        }
        @CustomType.Setter
        public Builder resetOnValid(@Nullable Boolean resetOnValid) {

            this.resetOnValid = resetOnValid;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByCookie(@Nullable Boolean userIdentificationByCookie) {

            this.userIdentificationByCookie = userIdentificationByCookie;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByHeaders(@Nullable Boolean userIdentificationByHeaders) {

            this.userIdentificationByHeaders = userIdentificationByHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByIp(@Nullable Boolean userIdentificationByIp) {

            this.userIdentificationByIp = userIdentificationByIp;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByParams(@Nullable Boolean userIdentificationByParams) {

            this.userIdentificationByParams = userIdentificationByParams;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationKeyCookie(@Nullable String userIdentificationKeyCookie) {

            this.userIdentificationKeyCookie = userIdentificationKeyCookie;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationKeyHeaders(@Nullable List<String> userIdentificationKeyHeaders) {

            this.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            return this;
        }
        public Builder userIdentificationKeyHeaders(String... userIdentificationKeyHeaders) {
            return userIdentificationKeyHeaders(List.of(userIdentificationKeyHeaders));
        }
        @CustomType.Setter
        public Builder userIdentificationKeyParams(@Nullable List<String> userIdentificationKeyParams) {

            this.userIdentificationKeyParams = userIdentificationKeyParams;
            return this;
        }
        public Builder userIdentificationKeyParams(String... userIdentificationKeyParams) {
            return userIdentificationKeyParams(List.of(userIdentificationKeyParams));
        }
        @CustomType.Setter
        public Builder userIdentificationTitle(@Nullable String userIdentificationTitle) {

            this.userIdentificationTitle = userIdentificationTitle;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder validateOnOriginHeaderName(@Nullable String validateOnOriginHeaderName) {

            this.validateOnOriginHeaderName = validateOnOriginHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder validateOnOriginHeaderValue(@Nullable String validateOnOriginHeaderValue) {

            this.validateOnOriginHeaderValue = validateOnOriginHeaderValue;
            return this;
        }
        @CustomType.Setter
        public Builder validateOnOriginResponseCode(@Nullable Integer validateOnOriginResponseCode) {

            this.validateOnOriginResponseCode = validateOnOriginResponseCode;
            return this;
        }
        @CustomType.Setter
        public Builder validateOnOriginWith(@Nullable String validateOnOriginWith) {

            this.validateOnOriginWith = validateOnOriginWith;
            return this;
        }
        @CustomType.Setter
        public Builder validationTitle(@Nullable String validationTitle) {

            this.validationTitle = validationTitle;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorInputValidation();
            _resultValue.allowLargePostBody = allowLargePostBody;
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.enabled = enabled;
            _resultValue.failure302Uri = failure302Uri;
            _resultValue.label = label;
            _resultValue.locked = locked;
            _resultValue.penalty302Uri = penalty302Uri;
            _resultValue.penalty403NetStoragePath = penalty403NetStoragePath;
            _resultValue.penaltyAction = penaltyAction;
            _resultValue.penaltyBrandedDenyCacheTtl = penaltyBrandedDenyCacheTtl;
            _resultValue.penaltyNetStorage = penaltyNetStorage;
            _resultValue.penaltyThreshold = penaltyThreshold;
            _resultValue.penaltyTitle = penaltyTitle;
            _resultValue.resetOnValid = resetOnValid;
            _resultValue.templateUuid = templateUuid;
            _resultValue.userIdentificationByCookie = userIdentificationByCookie;
            _resultValue.userIdentificationByHeaders = userIdentificationByHeaders;
            _resultValue.userIdentificationByIp = userIdentificationByIp;
            _resultValue.userIdentificationByParams = userIdentificationByParams;
            _resultValue.userIdentificationKeyCookie = userIdentificationKeyCookie;
            _resultValue.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            _resultValue.userIdentificationKeyParams = userIdentificationKeyParams;
            _resultValue.userIdentificationTitle = userIdentificationTitle;
            _resultValue.uuid = uuid;
            _resultValue.validateOnOriginHeaderName = validateOnOriginHeaderName;
            _resultValue.validateOnOriginHeaderValue = validateOnOriginHeaderValue;
            _resultValue.validateOnOriginResponseCode = validateOnOriginResponseCode;
            _resultValue.validateOnOriginWith = validateOnOriginWith;
            _resultValue.validationTitle = validationTitle;
            return _resultValue;
        }
    }
}
