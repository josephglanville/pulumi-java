// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Valid enum values in case of an enum property.
 * 
 */
public final class ProfileEnumValidValuesFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProfileEnumValidValuesFormatResponse Empty = new ProfileEnumValidValuesFormatResponse();

    /**
     * Localized names of the enum member.
     * 
     */
    @InputImport(name="localizedValueNames")
      private final @Nullable Map<String,String> localizedValueNames;

    public Map<String,String> getLocalizedValueNames() {
        return this.localizedValueNames == null ? Map.of() : this.localizedValueNames;
    }

    /**
     * The integer value of the enum member.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Integer value;

    public Optional<Integer> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ProfileEnumValidValuesFormatResponse(
        @Nullable Map<String,String> localizedValueNames,
        @Nullable Integer value) {
        this.localizedValueNames = localizedValueNames;
        this.value = value;
    }

    private ProfileEnumValidValuesFormatResponse() {
        this.localizedValueNames = Map.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileEnumValidValuesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> localizedValueNames;
        private @Nullable Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileEnumValidValuesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localizedValueNames = defaults.localizedValueNames;
    	      this.value = defaults.value;
        }

        public Builder setLocalizedValueNames(@Nullable Map<String,String> localizedValueNames) {
            this.localizedValueNames = localizedValueNames;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public ProfileEnumValidValuesFormatResponse build() {
            return new ProfileEnumValidValuesFormatResponse(localizedValueNames, value);
        }
    }
}
