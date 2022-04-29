// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLogAnalyticsPreferenceItem {
    /**
     * @return The preference name. Currently, only &#34;DEFAULT_HOMEPAGE&#34; is supported.
     * 
     */
    private final String name;
    /**
     * @return The preference value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetLogAnalyticsPreferenceItem(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The preference name. Currently, only &#34;DEFAULT_HOMEPAGE&#34; is supported.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The preference value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogAnalyticsPreferenceItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogAnalyticsPreferenceItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetLogAnalyticsPreferenceItem build() {
            return new GetLogAnalyticsPreferenceItem(name, value);
        }
    }
}
