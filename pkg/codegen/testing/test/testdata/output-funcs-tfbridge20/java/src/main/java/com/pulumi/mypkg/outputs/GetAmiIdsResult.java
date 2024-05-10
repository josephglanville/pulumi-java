// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mypkg.outputs.GetAmiIdsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAmiIdsResult {
    private @Nullable List<String> executableUsers;
    private @Nullable List<GetAmiIdsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> owners;
    private @Nullable Boolean sortAscending;

    private GetAmiIdsResult() {}
    public List<String> executableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }
    public List<GetAmiIdsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> owners() {
        return this.owners;
    }
    public Optional<Boolean> sortAscending() {
        return Optional.ofNullable(this.sortAscending);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> executableUsers;
        private @Nullable List<GetAmiIdsFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> owners;
        private @Nullable Boolean sortAscending;
        public Builder() {}
        public Builder(GetAmiIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableUsers = defaults.executableUsers;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.owners = defaults.owners;
    	      this.sortAscending = defaults.sortAscending;
        }

        @CustomType.Setter
        public Builder executableUsers(@Nullable List<String> executableUsers) {

            this.executableUsers = executableUsers;
            return this;
        }
        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetAmiIdsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAmiIdsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAmiIdsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder owners(List<String> owners) {
            if (owners == null) {
              throw new MissingRequiredPropertyException("GetAmiIdsResult", "owners");
            }
            this.owners = owners;
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        @CustomType.Setter
        public Builder sortAscending(@Nullable Boolean sortAscending) {

            this.sortAscending = sortAscending;
            return this;
        }
        public GetAmiIdsResult build() {
            final var _resultValue = new GetAmiIdsResult();
            _resultValue.executableUsers = executableUsers;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.owners = owners;
            _resultValue.sortAscending = sortAscending;
            return _resultValue;
        }
    }
}
