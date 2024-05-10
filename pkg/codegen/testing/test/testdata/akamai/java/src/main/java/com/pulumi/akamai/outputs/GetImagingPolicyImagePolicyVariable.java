// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyVariableEnumOption;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyVariable {
    private String defaultValue;
    private @Nullable List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions;
    private String name;
    private @Nullable String postfix;
    private @Nullable String prefix;
    private String type;

    private GetImagingPolicyImagePolicyVariable() {}
    public String defaultValue() {
        return this.defaultValue;
    }
    public List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions() {
        return this.enumOptions == null ? List.of() : this.enumOptions;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> postfix() {
        return Optional.ofNullable(this.postfix);
    }
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultValue;
        private @Nullable List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions;
        private String name;
        private @Nullable String postfix;
        private @Nullable String prefix;
        private String type;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.enumOptions = defaults.enumOptions;
    	      this.name = defaults.name;
    	      this.postfix = defaults.postfix;
    	      this.prefix = defaults.prefix;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder defaultValue(String defaultValue) {
            if (defaultValue == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyVariable", "defaultValue");
            }
            this.defaultValue = defaultValue;
            return this;
        }
        @CustomType.Setter
        public Builder enumOptions(@Nullable List<GetImagingPolicyImagePolicyVariableEnumOption> enumOptions) {

            this.enumOptions = enumOptions;
            return this;
        }
        public Builder enumOptions(GetImagingPolicyImagePolicyVariableEnumOption... enumOptions) {
            return enumOptions(List.of(enumOptions));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyVariable", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder postfix(@Nullable String postfix) {

            this.postfix = postfix;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {

            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetImagingPolicyImagePolicyVariable", "type");
            }
            this.type = type;
            return this;
        }
        public GetImagingPolicyImagePolicyVariable build() {
            final var _resultValue = new GetImagingPolicyImagePolicyVariable();
            _resultValue.defaultValue = defaultValue;
            _resultValue.enumOptions = enumOptions;
            _resultValue.name = name;
            _resultValue.postfix = postfix;
            _resultValue.prefix = prefix;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
