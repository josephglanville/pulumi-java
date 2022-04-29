// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.DrgRouteDistributionStatementMatchCriteriaArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DrgRouteDistributionStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final DrgRouteDistributionStatementArgs Empty = new DrgRouteDistributionStatementArgs();

    /**
     * Accept: import/export the route &#34;as is&#34;
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Accept: import/export the route &#34;as is&#34;
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
     * 
     */
    @Import(name="drgRouteDistributionId", required=true)
    private Output<String> drgRouteDistributionId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
     * 
     */
    public Output<String> drgRouteDistributionId() {
        return this.drgRouteDistributionId;
    }

    /**
     * (Updatable) The action is applied only if all of the match criteria are met. MATCH_ALL match type implies any input is considered a match.
     * 
     */
    @Import(name="matchCriteria", required=true)
    private Output<DrgRouteDistributionStatementMatchCriteriaArgs> matchCriteria;

    /**
     * @return (Updatable) The action is applied only if all of the match criteria are met. MATCH_ALL match type implies any input is considered a match.
     * 
     */
    public Output<DrgRouteDistributionStatementMatchCriteriaArgs> matchCriteria() {
        return this.matchCriteria;
    }

    /**
     * (Updatable) This field is used to specify the priority of each statement in a route distribution. The priority will be represented as a number between 0 and 65535 where a lower number indicates a higher priority. When a route is processed, statements are applied in the order defined by their priority. The first matching rule dictates the action that will be taken on the route.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return (Updatable) This field is used to specify the priority of each statement in a route distribution. The priority will be represented as a number between 0 and 65535 where a lower number indicates a higher priority. When a route is processed, statements are applied in the order defined by their priority. The first matching rule dictates the action that will be taken on the route.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    private DrgRouteDistributionStatementArgs() {}

    private DrgRouteDistributionStatementArgs(DrgRouteDistributionStatementArgs $) {
        this.action = $.action;
        this.drgRouteDistributionId = $.drgRouteDistributionId;
        this.matchCriteria = $.matchCriteria;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DrgRouteDistributionStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DrgRouteDistributionStatementArgs $;

        public Builder() {
            $ = new DrgRouteDistributionStatementArgs();
        }

        public Builder(DrgRouteDistributionStatementArgs defaults) {
            $ = new DrgRouteDistributionStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Accept: import/export the route &#34;as is&#34;
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Accept: import/export the route &#34;as is&#34;
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param drgRouteDistributionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteDistributionId(Output<String> drgRouteDistributionId) {
            $.drgRouteDistributionId = drgRouteDistributionId;
            return this;
        }

        /**
         * @param drgRouteDistributionId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route distribution.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteDistributionId(String drgRouteDistributionId) {
            return drgRouteDistributionId(Output.of(drgRouteDistributionId));
        }

        /**
         * @param matchCriteria (Updatable) The action is applied only if all of the match criteria are met. MATCH_ALL match type implies any input is considered a match.
         * 
         * @return builder
         * 
         */
        public Builder matchCriteria(Output<DrgRouteDistributionStatementMatchCriteriaArgs> matchCriteria) {
            $.matchCriteria = matchCriteria;
            return this;
        }

        /**
         * @param matchCriteria (Updatable) The action is applied only if all of the match criteria are met. MATCH_ALL match type implies any input is considered a match.
         * 
         * @return builder
         * 
         */
        public Builder matchCriteria(DrgRouteDistributionStatementMatchCriteriaArgs matchCriteria) {
            return matchCriteria(Output.of(matchCriteria));
        }

        /**
         * @param priority (Updatable) This field is used to specify the priority of each statement in a route distribution. The priority will be represented as a number between 0 and 65535 where a lower number indicates a higher priority. When a route is processed, statements are applied in the order defined by their priority. The first matching rule dictates the action that will be taken on the route.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority (Updatable) This field is used to specify the priority of each statement in a route distribution. The priority will be represented as a number between 0 and 65535 where a lower number indicates a higher priority. When a route is processed, statements are applied in the order defined by their priority. The first matching rule dictates the action that will be taken on the route.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public DrgRouteDistributionStatementArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.drgRouteDistributionId = Objects.requireNonNull($.drgRouteDistributionId, "expected parameter 'drgRouteDistributionId' to be non-null");
            $.matchCriteria = Objects.requireNonNull($.matchCriteria, "expected parameter 'matchCriteria' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
