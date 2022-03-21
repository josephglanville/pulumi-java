// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntityArgs Empty = new GetEntityArgs();

    /**
     * The filter parameter allows you to filter on the the name or display name fields. You can check for equality on the name field (e.g. name eq '{entityName}')  and you can check for substrings on either the name or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName, '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case insensitively.
     * 
     */
    @Import(name="filter")
      private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name eq 'groupName'")
     * 
     */
    @Import(name="groupName")
      private final @Nullable String groupName;

    public Optional<String> getGroupName() {
        return this.groupName == null ? Optional.empty() : Optional.ofNullable(this.groupName);
    }

    /**
     * The $search parameter is used in conjunction with the $filter parameter to return three different outputs depending on the parameter passed in.
     * With $search=AllowedParents the API will return the entity info of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     * With $search=AllowedChildren the API will return the entity info of all entities that can be added as children of the requested entity.
     * With $search=ParentAndFirstLevelChildren the API will return the parent and  first level of children that the user has either direct access to or indirect access via one of their descendants.
     * With $search=ParentOnly the API will return only the group if the user has access to at least one of the descendants of the group.
     * With $search=ChildrenOnly the API will return only the first level of children of the group entity info specified in $filter.  The user must have direct access to the children entities or one of it's descendants for it to show up in the results.
     * 
     */
    @Import(name="search")
      private final @Nullable String search;

    public Optional<String> getSearch() {
        return this.search == null ? Optional.empty() : Optional.ofNullable(this.search);
    }

    /**
     * This parameter specifies the fields to include in the response. Can include any combination of Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g. '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter can override select in $skipToken.
     * 
     */
    @Import(name="select")
      private final @Nullable String select;

    public Optional<String> getSelect() {
        return this.select == null ? Optional.empty() : Optional.ofNullable(this.select);
    }

    /**
     * Number of entities to skip over when retrieving results. Passing this in will override $skipToken.
     * 
     */
    @Import(name="skip")
      private final @Nullable Integer skip;

    public Optional<Integer> getSkip() {
        return this.skip == null ? Optional.empty() : Optional.ofNullable(this.skip);
    }

    /**
     * Page continuation token is only used if a previous operation returned a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a token parameter that specifies a starting point to use for subsequent calls.
     * 
     */
    @Import(name="skiptoken")
      private final @Nullable String skiptoken;

    public Optional<String> getSkiptoken() {
        return this.skiptoken == null ? Optional.empty() : Optional.ofNullable(this.skiptoken);
    }

    /**
     * Number of elements to return when retrieving results. Passing this in will override $skipToken.
     * 
     */
    @Import(name="top")
      private final @Nullable Integer top;

    public Optional<Integer> getTop() {
        return this.top == null ? Optional.empty() : Optional.ofNullable(this.top);
    }

    /**
     * The view parameter allows clients to filter the type of data that is returned by the getEntities call.
     * 
     */
    @Import(name="view")
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

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder search(@Nullable String search) {
            this.search = search;
            return this;
        }
        public Builder select(@Nullable String select) {
            this.select = select;
            return this;
        }
        public Builder skip(@Nullable Integer skip) {
            this.skip = skip;
            return this;
        }
        public Builder skiptoken(@Nullable String skiptoken) {
            this.skiptoken = skiptoken;
            return this;
        }
        public Builder top(@Nullable Integer top) {
            this.top = top;
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetEntityArgs build() {
            return new GetEntityArgs(filter, groupName, search, select, skip, skiptoken, top, view);
        }
    }
}
