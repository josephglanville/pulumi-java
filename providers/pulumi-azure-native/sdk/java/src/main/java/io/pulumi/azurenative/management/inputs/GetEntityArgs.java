// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntityArgs Empty = new GetEntityArgs();

    @InputImport(name="filter")
    private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    @InputImport(name="groupName")
    private final @Nullable String groupName;

    public Optional<String> getGroupName() {
        return this.groupName == null ? Optional.empty() : Optional.ofNullable(this.groupName);
    }

    @InputImport(name="search")
    private final @Nullable String search;

    public Optional<String> getSearch() {
        return this.search == null ? Optional.empty() : Optional.ofNullable(this.search);
    }

    @InputImport(name="select")
    private final @Nullable String select;

    public Optional<String> getSelect() {
        return this.select == null ? Optional.empty() : Optional.ofNullable(this.select);
    }

    @InputImport(name="skip")
    private final @Nullable Integer skip;

    public Optional<Integer> getSkip() {
        return this.skip == null ? Optional.empty() : Optional.ofNullable(this.skip);
    }

    @InputImport(name="skiptoken")
    private final @Nullable String skiptoken;

    public Optional<String> getSkiptoken() {
        return this.skiptoken == null ? Optional.empty() : Optional.ofNullable(this.skiptoken);
    }

    @InputImport(name="top")
    private final @Nullable Integer top;

    public Optional<Integer> getTop() {
        return this.top == null ? Optional.empty() : Optional.ofNullable(this.top);
    }

    @InputImport(name="view")
    private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetEntityArgs(
        @Nullable String filter,
        @Nullable String groupName,
        @Nullable String search,
        @Nullable String select,
        @Nullable Integer skip,
        @Nullable String skiptoken,
        @Nullable Integer top,
        @Nullable String view) {
        this.filter = filter;
        this.groupName = groupName;
        this.search = search;
        this.select = select;
        this.skip = skip;
        this.skiptoken = skiptoken;
        this.top = top;
        this.view = view;
    }

    private GetEntityArgs() {
        this.filter = null;
        this.groupName = null;
        this.search = null;
        this.select = null;
        this.skip = null;
        this.skiptoken = null;
        this.top = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private @Nullable String groupName;
        private @Nullable String search;
        private @Nullable String select;
        private @Nullable Integer skip;
        private @Nullable String skiptoken;
        private @Nullable Integer top;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.groupName = defaults.groupName;
    	      this.search = defaults.search;
    	      this.select = defaults.select;
    	      this.skip = defaults.skip;
    	      this.skiptoken = defaults.skiptoken;
    	      this.top = defaults.top;
    	      this.view = defaults.view;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setSearch(@Nullable String search) {
            this.search = search;
            return this;
        }

        public Builder setSelect(@Nullable String select) {
            this.select = select;
            return this;
        }

        public Builder setSkip(@Nullable Integer skip) {
            this.skip = skip;
            return this;
        }

        public Builder setSkiptoken(@Nullable String skiptoken) {
            this.skiptoken = skiptoken;
            return this;
        }

        public Builder setTop(@Nullable Integer top) {
            this.top = top;
            return this;
        }

        public Builder setView(@Nullable String view) {
            this.view = view;
            return this;
        }

        public GetEntityArgs build() {
            return new GetEntityArgs(filter, groupName, search, select, skip, skiptoken, top, view);
        }
    }
}