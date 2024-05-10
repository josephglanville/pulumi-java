// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mypkg.inputs.GetAmiIdsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiIdsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiIdsPlainArgs Empty = new GetAmiIdsPlainArgs();

    /**
     * Limit search to users with *explicit* launch
     * permission on  the image. Valid items are the numeric account ID or `self`.
     * 
     */
    @Import(name="executableUsers")
    private @Nullable List<String> executableUsers;

    /**
     * @return Limit search to users with *explicit* launch
     * permission on  the image. Valid items are the numeric account ID or `self`.
     * 
     */
    public Optional<List<String>> executableUsers() {
        return Optional.ofNullable(this.executableUsers);
    }

    /**
     * One or more name/value pairs to filter off of. There
     * are several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetAmiIdsFilter> filters;

    /**
     * @return One or more name/value pairs to filter off of. There
     * are several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    public Optional<List<GetAmiIdsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    @Import(name="owners", required=true)
    private List<String> owners;

    /**
     * @return List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    public List<String> owners() {
        return this.owners;
    }

    /**
     * Used to sort AMIs by creation time.
     * 
     */
    @Import(name="sortAscending")
    private @Nullable Boolean sortAscending;

    /**
     * @return Used to sort AMIs by creation time.
     * 
     */
    public Optional<Boolean> sortAscending() {
        return Optional.ofNullable(this.sortAscending);
    }

    private GetAmiIdsPlainArgs() {}

    private GetAmiIdsPlainArgs(GetAmiIdsPlainArgs $) {
        this.executableUsers = $.executableUsers;
        this.filters = $.filters;
        this.nameRegex = $.nameRegex;
        this.owners = $.owners;
        this.sortAscending = $.sortAscending;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiIdsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiIdsPlainArgs $;

        public Builder() {
            $ = new GetAmiIdsPlainArgs();
        }

        public Builder(GetAmiIdsPlainArgs defaults) {
            $ = new GetAmiIdsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executableUsers Limit search to users with *explicit* launch
         * permission on  the image. Valid items are the numeric account ID or `self`.
         * 
         * @return builder
         * 
         */
        public Builder executableUsers(@Nullable List<String> executableUsers) {
            $.executableUsers = executableUsers;
            return this;
        }

        /**
         * @param executableUsers Limit search to users with *explicit* launch
         * permission on  the image. Valid items are the numeric account ID or `self`.
         * 
         * @return builder
         * 
         */
        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There
         * are several valid keys, for a full reference, check out
         * [describe-images in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There
         * are several valid keys, for a full reference, check out
         * [describe-images in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetAmiIdsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param nameRegex A regex string to apply to the AMI list returned
         * by AWS. This allows more advanced filtering not supported from the AWS API.
         * This filtering is done locally on what AWS returns, and could have a performance
         * impact if the result is large. It is recommended to combine this with other
         * options to narrow down the list AWS returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param owners List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
         * 
         * @return builder
         * 
         */
        public Builder owners(List<String> owners) {
            $.owners = owners;
            return this;
        }

        /**
         * @param owners List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
         * 
         * @return builder
         * 
         */
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }

        /**
         * @param sortAscending Used to sort AMIs by creation time.
         * 
         * @return builder
         * 
         */
        public Builder sortAscending(@Nullable Boolean sortAscending) {
            $.sortAscending = sortAscending;
            return this;
        }

        public GetAmiIdsPlainArgs build() {
            if ($.owners == null) {
                throw new MissingRequiredPropertyException("GetAmiIdsPlainArgs", "owners");
            }
            return $;
        }
    }

}
