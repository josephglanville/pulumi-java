// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaskingPoliciesMaskingColumnMaskingFormat {
    /**
     * @return A condition that must be true for applying the masking format. It can be any valid  SQL construct that can be used in a SQL predicate. It enables you to do  &lt;a href=&#34;https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html&#34;&gt;conditional masking&lt;/a&gt;  so that you can mask the column data values differently using different masking  formats and the associated conditions.
     * 
     */
    private final String condition;
    /**
     * @return The description of the format entry.
     * 
     */
    private final String description;
    /**
     * @return An array of format entries. The combined output of all the format entries is  used for masking the column data values.
     * 
     */
    private final List<GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry> formatEntries;

    @CustomType.Constructor
    private GetMaskingPoliciesMaskingColumnMaskingFormat(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("formatEntries") List<GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry> formatEntries) {
        this.condition = condition;
        this.description = description;
        this.formatEntries = formatEntries;
    }

    /**
     * @return A condition that must be true for applying the masking format. It can be any valid  SQL construct that can be used in a SQL predicate. It enables you to do  &lt;a href=&#34;https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html&#34;&gt;conditional masking&lt;/a&gt;  so that you can mask the column data values differently using different masking  formats and the associated conditions.
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return The description of the format entry.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return An array of format entries. The combined output of all the format entries is  used for masking the column data values.
     * 
     */
    public List<GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry> formatEntries() {
        return this.formatEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingPoliciesMaskingColumnMaskingFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private String description;
        private List<GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry> formatEntries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingPoliciesMaskingColumnMaskingFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.formatEntries = defaults.formatEntries;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder formatEntries(List<GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry> formatEntries) {
            this.formatEntries = Objects.requireNonNull(formatEntries);
            return this;
        }
        public Builder formatEntries(GetMaskingPoliciesMaskingColumnMaskingFormatFormatEntry... formatEntries) {
            return formatEntries(List.of(formatEntries));
        }        public GetMaskingPoliciesMaskingColumnMaskingFormat build() {
            return new GetMaskingPoliciesMaskingColumnMaskingFormat(condition, description, formatEntries);
        }
    }
}
