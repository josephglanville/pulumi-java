// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDetectorRecipesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetDetectorRecipesFilter Empty = new GetDetectorRecipesFilter();

    /**
     * configuration name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return configuration name
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="regex")
    private @Nullable Boolean regex;

    public Optional<Boolean> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * List of configuration values
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return List of configuration values
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetDetectorRecipesFilter() {}

    private GetDetectorRecipesFilter(GetDetectorRecipesFilter $) {
        this.name = $.name;
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDetectorRecipesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDetectorRecipesFilter $;

        public Builder() {
            $ = new GetDetectorRecipesFilter();
        }

        public Builder(GetDetectorRecipesFilter defaults) {
            $ = new GetDetectorRecipesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name configuration name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder regex(@Nullable Boolean regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param values List of configuration values
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values List of configuration values
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetDetectorRecipesFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
