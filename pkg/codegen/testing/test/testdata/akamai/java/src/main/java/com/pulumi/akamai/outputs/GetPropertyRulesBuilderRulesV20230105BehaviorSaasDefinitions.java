// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions {
    private @Nullable String applicationAction;
    private @Nullable Boolean applicationCnameEnabled;
    private @Nullable Integer applicationCnameLevel;
    private @Nullable String applicationCookie;
    private @Nullable String applicationQueryString;
    private @Nullable String applicationRegex;
    private @Nullable String applicationReplace;
    private @Nullable String applicationTitle;
    private @Nullable String customerAction;
    private @Nullable Boolean customerCnameEnabled;
    private @Nullable Integer customerCnameLevel;
    private @Nullable String customerCookie;
    private @Nullable String customerQueryString;
    private @Nullable String customerRegex;
    private @Nullable String customerReplace;
    private @Nullable String customerTitle;
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable String usersAction;
    private @Nullable Boolean usersCnameEnabled;
    private @Nullable Integer usersCnameLevel;
    private @Nullable String usersCookie;
    private @Nullable String usersQueryString;
    private @Nullable String usersRegex;
    private @Nullable String usersReplace;
    private @Nullable String usersTitle;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions() {}
    public Optional<String> applicationAction() {
        return Optional.ofNullable(this.applicationAction);
    }
    public Optional<Boolean> applicationCnameEnabled() {
        return Optional.ofNullable(this.applicationCnameEnabled);
    }
    public Optional<Integer> applicationCnameLevel() {
        return Optional.ofNullable(this.applicationCnameLevel);
    }
    public Optional<String> applicationCookie() {
        return Optional.ofNullable(this.applicationCookie);
    }
    public Optional<String> applicationQueryString() {
        return Optional.ofNullable(this.applicationQueryString);
    }
    public Optional<String> applicationRegex() {
        return Optional.ofNullable(this.applicationRegex);
    }
    public Optional<String> applicationReplace() {
        return Optional.ofNullable(this.applicationReplace);
    }
    public Optional<String> applicationTitle() {
        return Optional.ofNullable(this.applicationTitle);
    }
    public Optional<String> customerAction() {
        return Optional.ofNullable(this.customerAction);
    }
    public Optional<Boolean> customerCnameEnabled() {
        return Optional.ofNullable(this.customerCnameEnabled);
    }
    public Optional<Integer> customerCnameLevel() {
        return Optional.ofNullable(this.customerCnameLevel);
    }
    public Optional<String> customerCookie() {
        return Optional.ofNullable(this.customerCookie);
    }
    public Optional<String> customerQueryString() {
        return Optional.ofNullable(this.customerQueryString);
    }
    public Optional<String> customerRegex() {
        return Optional.ofNullable(this.customerRegex);
    }
    public Optional<String> customerReplace() {
        return Optional.ofNullable(this.customerReplace);
    }
    public Optional<String> customerTitle() {
        return Optional.ofNullable(this.customerTitle);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> usersAction() {
        return Optional.ofNullable(this.usersAction);
    }
    public Optional<Boolean> usersCnameEnabled() {
        return Optional.ofNullable(this.usersCnameEnabled);
    }
    public Optional<Integer> usersCnameLevel() {
        return Optional.ofNullable(this.usersCnameLevel);
    }
    public Optional<String> usersCookie() {
        return Optional.ofNullable(this.usersCookie);
    }
    public Optional<String> usersQueryString() {
        return Optional.ofNullable(this.usersQueryString);
    }
    public Optional<String> usersRegex() {
        return Optional.ofNullable(this.usersRegex);
    }
    public Optional<String> usersReplace() {
        return Optional.ofNullable(this.usersReplace);
    }
    public Optional<String> usersTitle() {
        return Optional.ofNullable(this.usersTitle);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String applicationAction;
        private @Nullable Boolean applicationCnameEnabled;
        private @Nullable Integer applicationCnameLevel;
        private @Nullable String applicationCookie;
        private @Nullable String applicationQueryString;
        private @Nullable String applicationRegex;
        private @Nullable String applicationReplace;
        private @Nullable String applicationTitle;
        private @Nullable String customerAction;
        private @Nullable Boolean customerCnameEnabled;
        private @Nullable Integer customerCnameLevel;
        private @Nullable String customerCookie;
        private @Nullable String customerQueryString;
        private @Nullable String customerRegex;
        private @Nullable String customerReplace;
        private @Nullable String customerTitle;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String usersAction;
        private @Nullable Boolean usersCnameEnabled;
        private @Nullable Integer usersCnameLevel;
        private @Nullable String usersCookie;
        private @Nullable String usersQueryString;
        private @Nullable String usersRegex;
        private @Nullable String usersReplace;
        private @Nullable String usersTitle;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationAction = defaults.applicationAction;
    	      this.applicationCnameEnabled = defaults.applicationCnameEnabled;
    	      this.applicationCnameLevel = defaults.applicationCnameLevel;
    	      this.applicationCookie = defaults.applicationCookie;
    	      this.applicationQueryString = defaults.applicationQueryString;
    	      this.applicationRegex = defaults.applicationRegex;
    	      this.applicationReplace = defaults.applicationReplace;
    	      this.applicationTitle = defaults.applicationTitle;
    	      this.customerAction = defaults.customerAction;
    	      this.customerCnameEnabled = defaults.customerCnameEnabled;
    	      this.customerCnameLevel = defaults.customerCnameLevel;
    	      this.customerCookie = defaults.customerCookie;
    	      this.customerQueryString = defaults.customerQueryString;
    	      this.customerRegex = defaults.customerRegex;
    	      this.customerReplace = defaults.customerReplace;
    	      this.customerTitle = defaults.customerTitle;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.usersAction = defaults.usersAction;
    	      this.usersCnameEnabled = defaults.usersCnameEnabled;
    	      this.usersCnameLevel = defaults.usersCnameLevel;
    	      this.usersCookie = defaults.usersCookie;
    	      this.usersQueryString = defaults.usersQueryString;
    	      this.usersRegex = defaults.usersRegex;
    	      this.usersReplace = defaults.usersReplace;
    	      this.usersTitle = defaults.usersTitle;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder applicationAction(@Nullable String applicationAction) {

            this.applicationAction = applicationAction;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCnameEnabled(@Nullable Boolean applicationCnameEnabled) {

            this.applicationCnameEnabled = applicationCnameEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCnameLevel(@Nullable Integer applicationCnameLevel) {

            this.applicationCnameLevel = applicationCnameLevel;
            return this;
        }
        @CustomType.Setter
        public Builder applicationCookie(@Nullable String applicationCookie) {

            this.applicationCookie = applicationCookie;
            return this;
        }
        @CustomType.Setter
        public Builder applicationQueryString(@Nullable String applicationQueryString) {

            this.applicationQueryString = applicationQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder applicationRegex(@Nullable String applicationRegex) {

            this.applicationRegex = applicationRegex;
            return this;
        }
        @CustomType.Setter
        public Builder applicationReplace(@Nullable String applicationReplace) {

            this.applicationReplace = applicationReplace;
            return this;
        }
        @CustomType.Setter
        public Builder applicationTitle(@Nullable String applicationTitle) {

            this.applicationTitle = applicationTitle;
            return this;
        }
        @CustomType.Setter
        public Builder customerAction(@Nullable String customerAction) {

            this.customerAction = customerAction;
            return this;
        }
        @CustomType.Setter
        public Builder customerCnameEnabled(@Nullable Boolean customerCnameEnabled) {

            this.customerCnameEnabled = customerCnameEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder customerCnameLevel(@Nullable Integer customerCnameLevel) {

            this.customerCnameLevel = customerCnameLevel;
            return this;
        }
        @CustomType.Setter
        public Builder customerCookie(@Nullable String customerCookie) {

            this.customerCookie = customerCookie;
            return this;
        }
        @CustomType.Setter
        public Builder customerQueryString(@Nullable String customerQueryString) {

            this.customerQueryString = customerQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder customerRegex(@Nullable String customerRegex) {

            this.customerRegex = customerRegex;
            return this;
        }
        @CustomType.Setter
        public Builder customerReplace(@Nullable String customerReplace) {

            this.customerReplace = customerReplace;
            return this;
        }
        @CustomType.Setter
        public Builder customerTitle(@Nullable String customerTitle) {

            this.customerTitle = customerTitle;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder usersAction(@Nullable String usersAction) {

            this.usersAction = usersAction;
            return this;
        }
        @CustomType.Setter
        public Builder usersCnameEnabled(@Nullable Boolean usersCnameEnabled) {

            this.usersCnameEnabled = usersCnameEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder usersCnameLevel(@Nullable Integer usersCnameLevel) {

            this.usersCnameLevel = usersCnameLevel;
            return this;
        }
        @CustomType.Setter
        public Builder usersCookie(@Nullable String usersCookie) {

            this.usersCookie = usersCookie;
            return this;
        }
        @CustomType.Setter
        public Builder usersQueryString(@Nullable String usersQueryString) {

            this.usersQueryString = usersQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder usersRegex(@Nullable String usersRegex) {

            this.usersRegex = usersRegex;
            return this;
        }
        @CustomType.Setter
        public Builder usersReplace(@Nullable String usersReplace) {

            this.usersReplace = usersReplace;
            return this;
        }
        @CustomType.Setter
        public Builder usersTitle(@Nullable String usersTitle) {

            this.usersTitle = usersTitle;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorSaasDefinitions();
            _resultValue.applicationAction = applicationAction;
            _resultValue.applicationCnameEnabled = applicationCnameEnabled;
            _resultValue.applicationCnameLevel = applicationCnameLevel;
            _resultValue.applicationCookie = applicationCookie;
            _resultValue.applicationQueryString = applicationQueryString;
            _resultValue.applicationRegex = applicationRegex;
            _resultValue.applicationReplace = applicationReplace;
            _resultValue.applicationTitle = applicationTitle;
            _resultValue.customerAction = customerAction;
            _resultValue.customerCnameEnabled = customerCnameEnabled;
            _resultValue.customerCnameLevel = customerCnameLevel;
            _resultValue.customerCookie = customerCookie;
            _resultValue.customerQueryString = customerQueryString;
            _resultValue.customerRegex = customerRegex;
            _resultValue.customerReplace = customerReplace;
            _resultValue.customerTitle = customerTitle;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.usersAction = usersAction;
            _resultValue.usersCnameEnabled = usersCnameEnabled;
            _resultValue.usersCnameLevel = usersCnameLevel;
            _resultValue.usersCookie = usersCookie;
            _resultValue.usersQueryString = usersQueryString;
            _resultValue.usersRegex = usersRegex;
            _resultValue.usersReplace = usersReplace;
            _resultValue.usersTitle = usersTitle;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
