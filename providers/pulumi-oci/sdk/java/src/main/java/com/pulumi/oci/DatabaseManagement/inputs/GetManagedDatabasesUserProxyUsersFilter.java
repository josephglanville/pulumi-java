// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedDatabasesUserProxyUsersFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabasesUserProxyUsersFilter Empty = new GetManagedDatabasesUserProxyUsersFilter();

    /**
     * A filter to return only resources that match the entire name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return A filter to return only resources that match the entire name.
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

    private GetManagedDatabasesUserProxyUsersFilter() {}

    private GetManagedDatabasesUserProxyUsersFilter(GetManagedDatabasesUserProxyUsersFilter $) {
        this.name = $.name;
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabasesUserProxyUsersFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabasesUserProxyUsersFilter $;

        public Builder() {
            $ = new GetManagedDatabasesUserProxyUsersFilter();
        }

        public Builder(GetManagedDatabasesUserProxyUsersFilter defaults) {
            $ = new GetManagedDatabasesUserProxyUsersFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A filter to return only resources that match the entire name.
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

        public GetManagedDatabasesUserProxyUsersFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
