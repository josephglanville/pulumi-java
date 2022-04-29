// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.GetRegistryTypesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryTypesArgs Empty = new GetRegistryTypesArgs();

    @Import(name="filters")
    private @Nullable List<GetRegistryTypesFilter> filters;

    public Optional<List<GetRegistryTypesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Used to filter by the name of the object.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Used to filter by the name of the object.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    /**
     * Type of the object to filter the results with.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return Type of the object to filter the results with.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetRegistryTypesArgs() {}

    private GetRegistryTypesArgs(GetRegistryTypesArgs $) {
        this.filters = $.filters;
        this.name = $.name;
        this.registryId = $.registryId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryTypesArgs $;

        public Builder() {
            $ = new GetRegistryTypesArgs();
        }

        public Builder(GetRegistryTypesArgs defaults) {
            $ = new GetRegistryTypesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetRegistryTypesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRegistryTypesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Used to filter by the name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param type Type of the object to filter the results with.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetRegistryTypesArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
