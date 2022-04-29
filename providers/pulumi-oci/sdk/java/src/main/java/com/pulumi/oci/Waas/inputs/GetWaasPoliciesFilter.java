// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaasPoliciesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetWaasPoliciesFilter Empty = new GetWaasPoliciesFilter();

    /**
     * The unique name of the whitelist.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The unique name of the whitelist.
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

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetWaasPoliciesFilter() {}

    private GetWaasPoliciesFilter(GetWaasPoliciesFilter $) {
        this.name = $.name;
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWaasPoliciesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWaasPoliciesFilter $;

        public Builder() {
            $ = new GetWaasPoliciesFilter();
        }

        public Builder(GetWaasPoliciesFilter defaults) {
            $ = new GetWaasPoliciesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique name of the whitelist.
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

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetWaasPoliciesFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
